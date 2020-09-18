fun main(args: Array<String>){
	val items: List<Int> = listOf(1,2,3,4)
	println(items.first())
	println(items.last())
	println(items.filter{it % 2 == 0})

	val rwMap: HashMap<String, Int> = hashMapOf("foo" to 1, "bar" to 2)
	println(rwMap["foo"])

	val strings: HashSet<String> = hashSetOf("a", "b", "c", "d")
	println(strings)
}