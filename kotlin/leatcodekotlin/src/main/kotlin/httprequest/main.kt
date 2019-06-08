package httprequest

import org.json.JSONObject
import java.net.HttpURLConnection
import java.net.URL
import java.text.SimpleDateFormat
import java.util.*

fun main() {
    fetchConnpassEventList().sortedBy { it.startedAt }.forEach {
        val output = "${it.startedAt.format()}\t=HYPERLINK(\"${it.eventUrl}\",\"${it.title}\")"
        println(output)
    }
}

private fun fetchConnpassEventList(): List<Event> {
    val url = URL("https://connpass.com/api/v1/event/?nickname=kwmt27&count=100")
    return with(url.openConnection() as HttpURLConnection) {
        requestMethod = "GET"
        println("\nSent 'GET' request to URL : $url; Response Code : $responseCode")
        inputStream.bufferedReader().use {
            val response = StringBuffer()

            var inputLine = it.readLine()
            while (inputLine != null) {
                response.append(inputLine)
                inputLine = it.readLine()
            }
            it.close()
            parseJSON(JSONObject(response.toString()))
        }
    }
}

private fun parseJSON(jsonObject: JSONObject): List<Event> {
    val jsonArray = jsonObject.getJSONArray("events")

    return jsonArray.withIndex().map { (i, _) ->
        val json = jsonArray.getJSONObject(i)
        Event(
            title = json.get("title") as? String ?: "",
            startedAt = (json.get("started_at")  as? String)?.parse(),
            eventUrl = json.get("event_url")  as? String ?: ""
        )
    }
}

private fun String.parse(): Date? {
    val df = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX")
    return runCatching {
        df.parse(this)
    }.getOrNull()
}

private fun Date?.format(): String? {
    if (this == null) {
        return null
    }
    val df = SimpleDateFormat("yyyy/MM/dd")
    return df.format(this)
}

private data class Event(
    val title: String,
    val startedAt: Date?, // パースできなかったらnull
    val eventUrl: String
)