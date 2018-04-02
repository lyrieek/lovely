package pers.th.lovely.core

import pers.th.lovely.service.MouseService

def dispatcher = new Dispatcher(MouseService.class)

println dispatcher.method("leftClick")
