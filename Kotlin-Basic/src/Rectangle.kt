import abstractClasses.Shape
import interfaces.RectangleProperties

class Rectangle (
    var height: Double, var length: Double
) : Shape(listOf(height, length, height, length)), RectangleProperties {
    override val isSquare: Boolean
        get() = length == height

    override fun calculateArea(): Double = height * length
}