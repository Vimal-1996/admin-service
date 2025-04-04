# admin-service

📌 Summary: Which Microservices Talk to Each Other?
Caller	Target Service	Purpose
Auth Service	Admin, Vendor, Customer Services	Validate authentication
Admin Service	Vendor, Product, Customer Services	Manage vendors, products & customers
Vendor Service	Product, Order Services	Manage products & orders
Product Service	Order, Cart, Vendor Services	Validate stock & fetch product info
Order Service	Product, Customer, Notification Services	Validate products & notify customers
Cart Service	Product, Customer Services	Add products to cart & check stock
Notification Service	Order Service	Send email notifications
