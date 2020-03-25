import pers.th.lovely.service.MouseService

import java.awt.Robot

//def x = 442.toBigDecimal().divide(1.25.toBigDecimal(), BigDecimal.ROUND_HALF_EVEN).toInteger()
//def y = 531.toBigDecimal().divide(1.25.toBigDecimal(), BigDecimal.ROUND_HALF_EVEN).toInteger()

//int x = (int) (1919 / 1.25)
//int y = (int) (1199 / 1.25)
//int x = 1919-100
//int y = 1199-100

ms = new MouseService()
while (true) {
    ms.move(428,723)
    ms.leftClick()
    sleep 1537
    ms.move(857,537)
    ms.leftClick()
    sleep 1356
    ms.move(1250,394)
    ms.leftClick()
//    ms.move(660,260)
//    ms.leftClick5()
    sleep 12211
}
//ms.ctrl()
//sleep 200
//ms.move(1501,605)
//ms.ctrl()
//sleep 200
//ms.move(1501,605)
//ms.ctrl()
//sleep 200
//ms.move(1501,605)
//ms.ctrl()

/*
for (;;) {
    ms.move(1551,595)
    ms.leftClick5()
    sleep 200
    ms.move(1607,527)
    ms.leftClick5()
//    sleep 200
//    ms.move(1437,549)
//    ms.leftClick5()
//    sleep 200
//    ms.move(1527,695)
//    ms.leftClick5()
    sleep 5000
}
*/
