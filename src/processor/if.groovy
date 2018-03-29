import pers.th.lovely.internal.Expression

def expr = new Expression()
'''
import pers.th.lovely.internal.Expression

def file = new File("../../resource/demo.l")
def expr = new Expression()
assert file.exists() : "file exists"

file.eachLine {
//    println it
    expr.analysis it
}

'''.split(System.lineSeparator()).each {
    println it
//    expr.analysis it
}
