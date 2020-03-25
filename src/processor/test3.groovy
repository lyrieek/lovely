import pers.th.lovely.service.MouseService

ms = new MouseService()

def tryBuy(int x, int y) {
    ms.move(x, y)
    sleep 220
    ms.leftClick()
    sleep 350
    ms.move(144, 936)
    sleep 350
    ms.leftClick()
    for (int i = 0; i < 9; i++) {
        sleep 422
        ms.esc()
    }
    sleep 1500
    ms.esc()
}

def get(int x, int y) {
    ms.move(x, y)
    sleep 300
    ms.leftClick()
    for (int i = 0; i < 7; i++) {
        sleep 382
        ms.esc()
    }
    sleep 1250
    ms.esc()
}

def basic6() {
    ms.esc()
    sleep 500
    ms.esc()
    get(644, 489)
    get(813, 368)
    get(1126, 474)
    get(990, 629)
    get(1393, 781)
    get(1506, 625)
    ms.esc()
    sleep 500
    ms.esc()
}

def esc() {
    for (int i = 0; i < 20; i++) {
        ms.esc()
        sleep 100
    }
}

def cancel() {
    esc()
    get(957, 950)
    get(955, 898)
    get(956, 883)
    get(953, 785)
    get(952, 756)
    get(951, 757)
}

int index = 0
while (true) {
    basic6()

    esc()

    get(535, 236)
    get(385, 359)
    get(378, 695)
//    上
    tryBuy(1732, 491)
    tryBuy(1590, 163)
    tryBuy(181, 273)
    tryBuy(357, 145)
    tryBuy(662, 153)
    basic6()
//    下
    tryBuy(1132, 985)
    tryBuy(899, 1134)
    tryBuy(677, 811)
    tryBuy(536, 1009)
//    核心

    tryBuy(956, 211)
    tryBuy(1276, 347)

    cancel()

    index++
    if (index == 10) {
        index = 0
        sleep 5000
        println index
    }
}

