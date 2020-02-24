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

# returnHistory 退货历史
| 字段  | 类型  | 约束  |  说明 |
|---|---|---|---|
| return_history_id |int | 主键自增 | 退货历史id|
| return_id |int |非空 | 退货id|
| time | date | 非空 | 订单时间 |
| return_status  | tinyint  | 非空，默认启用  | 状态（0禁用，1启用）  |
| comment | varchar(20) | 非空 | 备注 |
| customer_notified | varchar(20) | 非空 |  通知客户 | 



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

# order_products 订单商品表
| 字段  | 类型  | 约束  |  说明 |
|---|---|---|---|
| product_id | int | 主键 自增 | 商品id |
| product_code | int | 索引 | 商品代号 |
| product_name | varchar(20) | 非空 索引 | 商品名称 |
| unit_price | int | 非空 | 单价 |
| quantity | int | 非空 | 数量 |


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


# address 地址
| 字段  | 类型  | 约束  |  说明 |
|---|---|---|---|
| address_id | int |  自增 主键 | 地址id |
| customer_id | int | 非空 | 客户id|
| receiver_name | varchar(20) | 非空索引 | 货人姓名 | receiver_mobile | int | 非空 | 货人手机 |
|content | varchar(100) | 非空 | 地址内容 |
