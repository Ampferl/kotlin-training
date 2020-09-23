class Person(var name: String, var age: Int){
	fun info(){
		println("Name: ${this.name}\nAge: ${this.age}")
	}
}

fun main(){
	val p1 = Person("Jonas", 19)
	p1.info()
}
