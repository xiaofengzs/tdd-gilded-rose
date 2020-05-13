## tasks:
- Given 普通商品SellIn = 20, Quality = 30, When 过去了5天, 更新信息, Then SellIn = 15, Quality = 25
- Given 普通商品SellIn = 20, Quality = 30, When 过去了22天, 更新信息, Then SellIn = -2, Quality = 6
- Given 普通商品SellIn = 20, Quality = 30, When 过去了26天, 更新信息, Then SellIn = -6, Quality = 0
- Given 普通商品SellIn = 20, Quality = 10, When 过去了10天, 更新信息, Then SellIn = 10, Quality = 0
- Given 普通商品SellIn = 20, Quality = 10, When 过去了11天, 更新信息, Then SellIn = 9, Quality = 0

- Given 陈年干酪SellIn = 20，Quality = 25, when 过去了10天, 更新信息, Then SellIn = 10, Quality = 35
- Given 陈年干酪SellIn = 20，Quality = 25, when 过去了21天, 更新信息, Then SellIn = -1, Quality = 47
- Given 陈年干酪SellIn = 20，Quality = 25, when 过去了31天, 更新信息,Then SellIn = -11, Quality = 50

- Given 萨弗拉斯SellIn = 20，Quality = 30, when 过去了100天, 更新信息,Then SellIn = 120, Quality = 30
    
- Given 后台门票SellIn = 20，Quality = 5, when 过去了5天, 更新信息,Then SellIn = 15, Quality = 10
- Given 后台门票SellIn = 20，Quality = 5, when 过去了12天, 更新信息,Then SellIn = 8, Quality = 19
- Given 后台门票SellIn = 20，Quality = 5, when 过去了18天, 更新信息,Then SellIn = 2, Quality = 34
- Given 后台门票SellIn = 20，Quality = 5, when 过去了21天, 更新信息,Then SellIn = -1, Quality = 0
- Given 后台门票SellIn = 20，Quality = 30, when 过去了20天, 更新信息,Then SellIn = 0, Quality = 65 


