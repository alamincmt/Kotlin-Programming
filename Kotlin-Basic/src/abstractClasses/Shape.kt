package abstractClasses

abstract class Shape(val sides: List<Double>) {
    val perimiter: Double get() = sides.sum()
    abstract fun calculateArea(): Double
}