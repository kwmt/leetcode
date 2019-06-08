package net.kwmt27.inline

import org.openjdk.jmh.annotations.*
import org.openjdk.jmh.generators.core.ClassInfo
import java.util.concurrent.TimeUnit

//
//import org.openjdk.jmh.annotations.Benchmark
//import org.openjdk.jmh.runner.Runner
//import org.openjdk.jmh.runner.RunnerException
//import org.openjdk.jmh.runner.options.OptionsBuilder
//
//open class InlineBenchmark {
//
//
//    @Benchmark
//    fun wellHelloThere() {
//        // this method was intentionally left blank.
//    }
//
//
//    @Benchmark
//    fun inlineBench() {
//        Inline().test()
//    }
////    companion object {
////
////        @Throws(RunnerException::class)
////        @JvmStatic
////        fun main(args: Array<String>) {
////
////
////        }
////    }
//
//}

@State(Scope.Benchmark)
@Fork(1)
@Warmup(iterations = 0)
@Measurement(iterations = 1, time = 1, timeUnit = TimeUnit.SECONDS)
open class TestBenchmark {
    private var data = Inline()

    @Setup
    fun setUp() {
        data = Inline()
    }

    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
    fun sqrtBenchmark() {
        data.test()


    }

}