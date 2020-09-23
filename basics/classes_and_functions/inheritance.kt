open class A{
	fun test(){
		print("This is a test")
	}
}

class B: A(){}

fun main(){
	var a = B()
	a.test()
}
