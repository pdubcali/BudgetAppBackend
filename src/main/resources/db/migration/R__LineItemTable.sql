CREATE TABLE IF NOT EXISTS line_item (id uuid, item_name varchar(80), item_amount float
);

ALTER TABLE line_item ADD COLUMN date date;