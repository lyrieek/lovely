import pers.th.lovely.service.MouseService

ms = new MouseService()

def tryBuy(int x, int y) {
    ms.move(x, y)
    sleep 120
    ms.leftClick()
    sleep 320
    ms.move(79, 927)
    sleep 320
    ms.leftClick()
    for (int i = 0; i < 9; i++) {
        sleep 352
        ms.esc()
    }
    sleep 1200
    ms.esc()
    sleep 201
}

def get(int x, int y) {
    ms.move(x, y)
    sleep 100
    ms.leftClick()
    for (int i = 0; i < 5; i++) {
        sleep 382
        ms.esc()
    }
    sleep 820
    ms.esc()
    sleep 501
}

while (true) {
    get(756, 245)
    get(969, 185)
    get(1111, 369)
    get(941, 439)
    get(1138, 670)
    get(1400, 578)
    get(1614, 814)
    get(1438, 907)
    get(614, 550)

    tryBuy(1330,284)
    tryBuy(1602,469)
    tryBuy(1856,652)
    sleep 1200
}
