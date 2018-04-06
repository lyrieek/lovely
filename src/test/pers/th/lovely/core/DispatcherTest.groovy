package pers.th.lovely.core

def dispatcher = new Dispatcher(this.class)

println dispatcher.method("output")
println dispatcher.method("output",1024)

def output(){
    println 1
    "end"
}

def output(Integer param){
    println param
    param
}