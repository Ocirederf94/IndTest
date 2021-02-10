INSERT INTO brands (id, name) VALUES 
(1, 'ZARA'),
(2, 'Other Brand')
;

INSERT INTO products (id, name) VALUES 
(35455, 'Product 1')	
;

INSERT INTO item_prices (id, id_brand, start_date, end_date, price_list, id_product, priority, price, currency) VALUES 
(1, 1, '2020-06-14T00:00:00', '2020-12-31T23:59:59', 1, 35455, 0, 35.50, 'EUR'),
(2, 1, '2020-06-14T15:00:00', '2020-06-14T18:30:00', 2, 35455, 1, 25.45, 'EUR'),
(3, 1, '2020-06-15T00:00:00', '2020-06-15T11:00:00', 3, 35455, 1, 30.50, 'EUR'),
(4, 1, '2020-06-15T16:00:00', '2020-12-31T23:59:59', 4, 35455, 1, 38.95, 'EUR')
;


