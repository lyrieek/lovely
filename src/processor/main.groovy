import pers.th.lovely.internal.Expression

def file = new File("../../production/xmxcjh.md")
//def file = new File("../../resource/demo.l")
def expr = new Expression()
assert file.exists() : "file exists"

file.eachLine {
//    println it
    expr.analysis it
}
