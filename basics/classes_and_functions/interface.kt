interface InterfaceTest{
	var absVar: String
	fun absMethod(): String
}

class InterfaceImp: InterfaceTest{
	override var absVar: String = "Hello World"
	override fun absMethod() = absVar
}

fun main(){
	val obj = InterfaceImp()
	println(obj.absMethod())
}
