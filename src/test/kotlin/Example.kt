import com.thoughtworks.gauge.Step

class Example {

    @Step("Hello, Gauge!と出力する")
    fun printHelloGauge() {
        println("Hello, Gauge!")
    }
}