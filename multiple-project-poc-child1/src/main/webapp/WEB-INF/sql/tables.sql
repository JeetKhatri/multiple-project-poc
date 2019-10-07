create table legalwiz_Product (
	productId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	productName VARCHAR(75) null
);