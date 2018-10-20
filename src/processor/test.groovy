import pers.th.lovely.service.MouseService

def x = 442.toBigDecimal().divide(1.2.toBigDecimal(), BigDecimal.ROUND_HALF_EVEN).toInteger()
def y = 1132.toBigDecimal().divide(1.2.toBigDecimal(), BigDecimal.ROUND_HALF_EVEN).toInteger()

new MouseService().move(x, y)