import pers.th.lovely.service.MouseService

import java.awt.MouseInfo

def lastPoint = MouseInfo.getPointerInfo().getLocation()
def ms = new MouseService()

while (true) {
    def point = MouseInfo.getPointerInfo().getLocation()
    if (point == lastPoint){
        sleep 500
        continue
    }
    int x = (int) Math.round(point.getX())
    int y = (int) Math.round(point.getY())
    println "get(${x},${y})"
//    println "!"+ms.color(x,y).code()
    lastPoint = point
    sleep 1700
}