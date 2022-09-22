insert into categoria(nome)values ("Refrigerantes");
insert into categoria(nome)values ("Cervejas");
insert into categoria(nome)values ("Salgadinhos");
insert into produto(nome, preco, quantidade, validade, categoria_fk_codigo) value("Coca-cola descartavel 2 litros",12.30,10,"2022-08-31",1);
insert into produto(nome, preco, quantidade, validade, categoria_fk_codigo) value("Torcida Bacon",2.50,15,"2022-08-31",3);
insert into produto(nome, preco, quantidade, validade, categoria_fk_codigo) value("Heineken",9.00,30,"2022-08-31",2);

insert into pedido(horario)values ("2022-8-23 20:33:02");
insert into pedido(horario)values ("2022-8-22 20:33:02");
insert into pedido(horario)values ("2022-8-11 20:33:02");

insert into item(pedido_codigo, produto_codigo, preco, quantidade)values(3, 2,5.00, 2);