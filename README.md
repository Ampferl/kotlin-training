# Kotlin Training
Here i will train my kotlin skills a little bit :P
## Getting started
### Write your firt hello world
```kotlin
fun main(args: Array<String>){
	println("Hello World")
}
``` 
### Compile and Run it
Pick a `.kt` file and compile it:
```bash
kotlinc ::file_name::.kt -include-runtime -d ::file_name::.jar
```
You will get a `.jar` file and you can execute it like this:
```bash
java -jar ::file_name::.jar
```