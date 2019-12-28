package canonicalForm

import java.util.*


class Solution {
    fun numUniqueEmails(emails: Array<String>): Int {
        val seen = emails.map { email ->
            val i = email.indexOf('@')
            var local = email.substring(0, i)
            val rest = email.substring(i)
            if (local.contains("+")) {
                local = local.substring(0, local.indexOf('+'))
            }
            local = local.replace(".".toRegex(), "")
            (local + rest)
        }.toHashSet()
        return seen.size
    }
}