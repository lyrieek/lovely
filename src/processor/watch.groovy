import java.awt.MouseInfo

def lastPoint = MouseInfo.getPointerInfo().getLocation()

while (true) {
    def point = MouseInfo.getPointerInfo().getLocation()
    if (point == lastPoint){
        sleep 500
        continue
    }
    print Math.round(point.getX()) + ","
    println Math.round(point.getY())
    lastPoint = point
    sleep 500
}