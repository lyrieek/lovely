package pers.th.lovely.core

def router = new Router()

println router.addRecord("user.system",new Dispatcher(System.class))
println router.addRecord("user.string",new Dispatcher(String.class))

println router.rmRecord("user.string")
println router.get("user.system").method("gc")
