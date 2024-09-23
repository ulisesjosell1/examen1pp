abstract class Vehicle(private var speed: Int) {
    fun getSpeed(): Int {
        return speed
    }

    fun setSpeed(newSpeed: Int) {
        speed = newSpeed
    }

    abstract fun fuelType(): String

    open fun startEngine() {
        println("El motor del vehículo arranca.")
    }
}

class Car(speed: Int, private val model: String) : Vehicle(speed) {

    override fun fuelType(): String {
        return "Gasolina"
    }

    override fun startEngine() {
        println("El motor del coche arranca con ruido.")
    }

    fun displayModel() {
        println("Modelo del coche: $model")
    }
}

fun main() {
    val myCar = Car(100, "Ford")

    println("Velocidad inicial: ${myCar.getSpeed()} km/h")
    myCar.setSpeed(120)
    println("Velocidad actualizada: ${myCar.getSpeed()} km/h")

    println("Tipo de combustible: ${myCar.fuelType()}")
    myCar.startEngine()

    myCar.displayModel()
}