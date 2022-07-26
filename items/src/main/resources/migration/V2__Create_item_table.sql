CREATE TABLE items.list_items
(
    id_item     BIGINT GENERATED BY DEFAULT AS IDENTITY NOT NULL,
    category BIGINT,
    product  INTEGER,
    is_supplier BOOLEAN                                 NOT NULL,
    amount      INTEGER,
    price       DOUBLE PRECISION,
    CONSTRAINT pk_list_items PRIMARY KEY (id_item)
);