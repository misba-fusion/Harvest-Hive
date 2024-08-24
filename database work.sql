CREATE DATABASE ProjectDB;


CREATE TABLE register(
	username varchar(30), 
	userpassword varchar(30)
);

CREATE TABLE Farmers(
	FarmerID int Primary key Identity(101,1),
	Name varchar(50) not null,
	Contact_Number varchar(50) not null, 
	Address varchar(50) not null, 
	Farm_Size Decimal(7,3) not null,
	Crop_Details varchar(50) not null
);

CREATE TABLE Paddy(
	PaddyID int Primary key Identity(101,1),
	FarmerID int not null Foreign key references Farmers(FarmerID),
	Quantity decimal(7,3) not null,
	Date_of_Arrival date not null,
	Moisture_Level decimal(5,3) not null,
	Quality_Parameters varchar(50) not null,
	Storage_Location varchar(50) not null
);

CREATE TABLE Milling(
	MillingID int Primary key Identity(101,1),
	PaddyID int not null Foreign key references Paddy(PaddyID),
	Date_of_Milling date not null,
	Milling_Operator varchar(50) not null,
	Milling_Machine varchar(50) not null,
	Milling_Duration int not null,
	Broken_Rice_Percentage decimal(4,2) not null,
	Bran_Percentage decimal(4,2) not null,
	Rice_Quality_Parameters varchar(50) not null
);

CREATE TABLE Inventory(
	InventoryID int Primary key Identity(101,1),
	PaddyID int not null Foreign key references Paddy(PaddyID),
	Rice_Quantity decimal(5,3) not null,
	Broken_Rice_Quantity decimal(5,3) not null,
	Bran_Quantity decimal(5,3) not null,
	Storage_Location varchar(50) not null
);

CREATE TABLE Shop(
	ShopID int Primary key Identity(101,1),
	InventoryID int not null Foreign key references Inventory(InventoryID),
	Name varchar(50) not null,
	Address varchar(50) not null,
	Contract_Number int not null
);

CREATE TABLE Sales(
	SaleID int Primary key Identity(101,1),
	ShopID int not null Foreign key references Shop(ShopID),
	Rice_Quantity decimal(5,3) not null,
	Broken_Rice_Quantity decimal(5,3) not null,
	Bran_Quantity decimal(5,3) not null,
	Sale_Date date not null
);

CREATE TABLE Reports(
	ReportID int Primary key,
	PaddyID int not null Foreign key references Paddy(PaddyID),
	MillingID int not null Foreign key references Milling(MillingID),
	InventoryID int not null Foreign key references Inventory(InventoryID),
	SaleID int not null Foreign key references Sales(SaleID),
	Report_Date date not null
);

select * from register;
select * from Farmers;
select * from Paddy;
select * from Milling;
select * from Inventory;
select * from Shop;
select * from Sales;
select * from Reports;

DROP TABLE Farmers;
DROP TABLE Paddy;
DROP TABLE Inventory;
DROP TABLE Milling;
DROP TABLE Sales;
DROP TABLE Shop;
DROP TABLE Reports;
