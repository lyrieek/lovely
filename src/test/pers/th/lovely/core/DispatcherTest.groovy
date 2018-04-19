package pers.th.lovely.core

Dispatcher dispatcher = new Dispatcher(Random.class)

println dispatcher.method("nextInt")

println dispatcher.method("nextInt",120)


//Dispatcher dispatcher = new Dispatcher(this.class)
//
//println dispatcher.method("output",1024)
//
//Integer output(Integer param){
//    return param*2
//}


//println dispatcher.method("output")
//println dispatcher.method("output",1024)
//println dispatcher.method("output",new Integer(1024))
//output()
//output(1)
//
//def output(){
//    println 1
//    "end"
//}
//
//def output(Integer param){
//    println param
//    param
//}