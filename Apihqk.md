##  查询商品列表页

URL: /commodity/search?product_name={product_name}&price={price}
Method：GET  

ResponseBody:  
```json
[
    {
        "product_id":1234,
        "product_name": "联想电脑",
        "price": 12345,
        "price": 7,
        "stock_quantity": 100,
        "status": 1 ,
        "rewordPoints" : 9876,
        "description" : "这是一台电脑"
    },
    {
       "product_id":4321,
        "product_name": "联想电脑",
        "price": 43245,
        "price": 8,
        "stock_quantity": 100,
        "status": 1 ,
        "rewordPoints" : 9876,
        "description" : "这是一台电脑"
    }
]

```
Request Field 

# product 商品
| 字段  | 类型  | 约束  |  说明 |
|---|---|---|---|
| product_id | int | 主键 自增 | 商品id |
| product_abstract | varchar(100) | 非空 | 摘要 |
| product_code | int | 索引 | 商品代号 |
| product_name | varchar(20) | 非空 | 商品名称 |
| price | double | 非空 | 价格 |
| discount | int |  | 打折 |
| sort_orde | int | 索引 | 排序| 
| stock_quantity | int | 非空 |库存量 |
| status | varchar(20) | 非空，默认启用 |状态(0禁用，1启用) |
| rewordPoints | int | 索引 | 积分 |



# productDetail 商品详细副表
| 字段  | 类型  | 约束  |  说明 |
|---|---|---|---|
| product_id | int | 主键 自增 | 商品id |
| description | varchar(100) | 非空 | 描述 |
| other_pic_urls | varchar(100) |  | 其他图片 |


##  商品添加
URL: /commodity/add
Request Content-Type: application/json(默认) 
Method：POST  


RequestBody:  
```json
{
         "product_id":1234,
        "product_name": "苹果笔记",
        "price": 3232,
        "price": 9,
        "stock_quantity": 100,
        "status": 1 ,
        "rewordPoints" : 9876,
        "description" : "这是一台电脑",
        "other_pic_urls" : "图片",
}

```

ResponseBody:  
```json
123456

```

Request Field 

# product 商品
| 字段  | 类型  | 约束  |  说明 |
|---|---|---|---|
| product_id | int | 主键 自增 | 商品id |
| product_abstract | varchar(100) | 非空 | 摘要 |
| product_code | int | 索引 | 商品代号 |
| product_name | varchar(20) | 非空 | 商品名称 |
| price | double | 非空 | 价格 |
| discount | int |  | 打折 |
| sort_orde | int | 索引 | 排序| 
| stock_quantity | int | 非空 |库存量 |
| status | varchar(20) | 非空，默认启用 |状态(0禁用，1启用) |
| rewordPoints | int | 索引 | 积分 |



# productDetail 商品详细副表
| 字段  | 类型  | 约束  |  说明 |
|---|---|---|---|
| product_id | int | 主键 自增 | 商品id |
| description | varchar(100) | 非空 | 描述 |
| other_pic_urls | varchar(100) |  | 其他图片 |

##  客户列表页
URL: /client/search?username={username}&create_time={create_time}
Method：GET  

ResponseBody:  
```json
[
    {
        "customer_id":2,
        "username": "hqk",
        "email": 1221313,
        "mobile": 213131321,
        "mobile_verifed": 1 ,
        "create_time" : "2020-02-23",
        "real_name" : "zs"
    },
    {
        "customer_id":2,
        "username": "hqk",
        "email": 1221313,
        "mobile": 213131321,
        "mobile_verifed": 1 ,
        "create_time" : "2020-02-23",
        "real_name" : "zs"
    }
]

```

Request Field 


# customer 客户
| 字段  | 类型  | 约束  |  说明 |
|---|---|---|---|
| customer_id | int | 主键 自增 | 客户id|
| username | varchar(20) | 非空 索引 | 客户姓名 |
| mobile | varchar(100) | 非空 | 手机 |
|mobile_verifed| varchar(20) | 非空 | 手机验证码 |
| email  | varchar(100)  | 索引 | 邮箱  |
| email_verifed |  varchar(20) | 非空 | 邮箱验证|
| real_name | varchar(20) | 非空 | 姓名|
|defauit_address | varchar(100) | 非空 索引 | 默认地址 |
| encrypted_password | int | 非空 | 加密密码 |
| news_subscrbed | varchar(20) | 非空 | 新闻定略 |


##  订单列表页
URL: /order/search?customer_id={customer_id}&create_time={create_time}
Method：GET  

ResponseBody:  
```json
[
    {
        "order_id":2,
        "customer_id": 1,
        "status": 1,
        "total_price": 213131321,
        "reword_points": 4343 ,
        "create_time" : "2020-02-23",
        "update_time" : "2020-02-24",
        "pay_method" : 0,
        "ship_method" : "邮寄"
    },
    {
        "order_id":2,
        "customer_id": 1,
        "status": 1,
        "total_price": 213131321,
        "reword_points": 4343 ,
        "create_time" : "2020-02-23",
        "update_time" : "2020-02-24",
        "pay_method" : 0,
        "ship_method" : "邮寄"
    }
]

```

Request Field 

# order 订单
| 字段  | 类型  | 约束  |  说明 |
|---|---|---|---|
|order_id |int | 主键 自增 | 订单id |
| customer_id | int | 非空 | 客户id|
| status  | tinyint  | 非空，默认启用  | 状态（0禁用，1启用）  |
| total_price | double | 索引 | 总金额 |
| create_time  | datetime  |  非空 | 创建时间  |
| update_time | datetime | 非空 | 修改时间|
| reword_points | int | 索引 | 积分 |
| pay_method | tinyint | 非空 默认启用 | 支付方式(0支付宝 ，微信) |
| ship_method | varchar(20) | 非空 | 寄送方式 |


##  订单详情
URL: /order/particulars?order_id={order_id}
Request Content-Type: application/json(默认) 
Method：POST 

RequestBody:  
```json
{
       "order_id":2,
        "customer_id": 1,
        "status": 1,
        "total_price": 213131321,
        "reword_points": 4343 ,
        "create_time" : "2020-02-23",
        "update_time" : "2020-02-24",
        "pay_method" : 0,
        "ship_method" : "邮寄",
        "ship_address" : "河南洛阳",
        "invoice_address" : "河南洛阳",
        "ship_price" : 10

}


```

ResponseBody:  
```json
123456

```

Request Field

# order 订单
| 字段  | 类型  | 约束  |  说明 |
|---|---|---|---|
|order_id |int | 主键 自增 | 订单id |
| customer_id | int | 非空 | 客户id|
| status  | tinyint  | 非空，默认启用  | 状态（0禁用，1启用）  |
| total_price | double | 索引 | 总金额 |
| create_time  | datetime  |  非空 | 创建时间  |
| update_time | datetime | 非空 | 修改时间|
| reword_points | int | 索引 | 积分 |
| pay_method | tinyint | 非空 默认启用 | 支付方式(0支付宝 ，微信) |
| ship_method | varchar(20) | 非空 | 寄送方式 |

# orderDetail 订单详细副表
| 字段  | 类型  | 约束  |  说明 |
|---|---|---|---|
|order_id |int | 主键 自增 | 订单id |
|ship_address | varchar(20) | 非空 | 寄送地址 |
|invoice_address | varchar(20) | 非空 | 发票地址|
| ship_price | double | 非空索引 |邮费 |


##  订单发票页
URL: /order/invoice?order_id={order_id}
Method：GET  

RequestBody:  
```json
{
       "order_id":2,
        "customer_id": 1,
        "status": 1,
        "total_price": 213131321,
        "reword_points": 4343 ,
        "create_time" : "2020-02-23",
        "update_time" : "2020-02-24",
        "pay_method" : 0,
        "ship_method" : "邮寄",
        "ship_address" : "河南洛阳",
        "invoice_address" : "河南洛阳",
        "ship_price" : 10

}


```

ResponseBody:  
```json
123456

```

Request Field

# order 订单
| 字段  | 类型  | 约束  |  说明 |
|---|---|---|---|
|order_id |int | 主键 自增 | 订单id |
| customer_id | int | 非空 | 客户id|
| status  | tinyint  | 非空，默认启用  | 状态（0禁用，1启用）  |
| total_price | double | 索引 | 总金额 |
| create_time  | datetime  |  非空 | 创建时间  |
| update_time | datetime | 非空 | 修改时间|
| reword_points | int | 索引 | 积分 |
| pay_method | tinyint | 非空 默认启用 | 支付方式(0支付宝 ，微信) |
| ship_method | varchar(20) | 非空 | 寄送方式 |

# orderDetail 订单详细副表
| 字段  | 类型  | 约束  |  说明 |
|---|---|---|---|
|order_id |int | 主键 自增 | 订单id |
|ship_address | varchar(20) | 非空 | 寄送地址 |
|invoice_address | varchar(20) | 非空 | 发票地址|
| ship_price | double | 非空索引 |邮费 |

##  退货申请列表

URL: /return/search?order_id={order_id}&customer_name={customer_name}
Method：GET  

ResponseBody:  
```json
[
    {
        "return_id":2,
        "order_id": 1,
        "order_time": "2020-02-23",
        "customer_name": "hqk",
        "mobile": 1213131321 ,
        "product_code" : 971,
        "opened" : "无开封",
        "comment" : "不想要了",
        "action" : "待处理"
    },
    {
        "return_id":2,
        "order_id": 1,
        "order_time": "2020-02-23",
        "customer_name": "hqk",
        "mobile": 1213131321 ,
        "product_code" : 971,
        "opened" : "无开封",
        "comment" : "不想要了",
        "action" : "待处理"
    }
]

```

Request Field 






# return 退货
| 字段  | 类型  | 约束  |  说明 |
|---|---|---|---|
| return_id |int | 主键自增 | 退货id|
| order_id | int | 索引 | 订单id |
| order_time | date | 非空 | 订单时间 |
| customer_name | carchar(20) | 非空 | 顾客姓名 |
| email  | varchar(100)  | 索引 | 邮箱  |
| mobile | varchar(100) | 非空 | 手机 |
| product_code | int | 索引 | 商品代号 |
| product_name | varchar(20) | 非空 | 商品名称 |
| quantity | int | 非空 | 数量 | 
| reason | varchar(100) | 非空 | 理由 |
| opened | varchar(20) | 非空 | 开封|
| comment | varchar(20) | 非空 | 备注 |
| action | varchr(100) | 非空 | 处理方式 |


##  退货历史页

URL: /returnHistory/sales?return_history_id={return_history_id}
Request Content-Type: application/json(默认) 
Method：POST 

RequestBody:  
```json
{
       "return_history_id":2,
        "return_id": 1,
        "time" : "2020-02-23",
        "return_status" : 1,
        "comment" : "已退货",
        "customer_notified" : "已通知",


}


```

ResponseBody:  
```json
123456

```

Request Field

# returnHistory 退货历史
| 字段  | 类型  | 约束  |  说明 |
|---|---|---|---|
| return_history_id |int | 主键自增 | 退货历史id|
| return_id |int |非空 | 退货id|
| time | date | 非空 | 订单时间 |
| return_status  | tinyint  | 非空，默认启用  | 状态（0禁用，1启用）  |
| comment | varchar(20) | 非空 | 备注 |
| customer_notified | varchar(20) | 非空 |  通知客户 | 

##  管理员添加页

URL: /Administrator/add
Request Content-Type: application/json(默认) 
Method：POST  


RequestBody:  
```json
{
         "administrator_id":3,
        "username": "hqk",
        "real_name": "hqk",
        "email": "dkscaknxla",
        "encrypted_password": 21312312,
        "status": 1 ,
        "create_time" : "2020-02-02",
        "avatar_url" : "图片",
}

```

ResponseBody:  
```json
123456

```

Request Field 

# Administrator 管理员
| 字段  | 类型  | 约束  |  说明 |
|---|---|---|---|
| administrator_id  | int  | 主键 自增 | Id  |
| username | varchar(20)  | 非空，唯一索引 | 用户名  |
| real_name  | varchar(20)  | 索引 | 真实姓名  |
| email  | varchar(100)  | 索引 | 邮箱  |
| encrypted_password  | varchar(100)  | 非空 | 加密密码  |
| status  | tinyint  | 非空，默认启用  | 状态（0禁用，1启用）  |
| create_time  | datetime  |  非空 | 创建时间  |
| avatar_url  | varchar(100)  |   | 头像地址 |