  
CREATE DATABASE API_SPRING_BOOT
GO

use API_SPRING_BOOT
GO

CREATE TABLE comidas (
    id_comida INT PRIMARY KEY IDENTITY(1,1),
    nombre VARCHAR(100) NOT NULL,
    descripcion TEXT,
    precio DECIMAL(5, 2) NOT NULL,
    calorias int
);
GO

SELECT * FROM comidas

INSERT INTO comidas (nombre, descripcion, precio, calorias) VALUES
('Pizza Margarita', 'Pizza con salsa de tomate, mozzarella y albahaca fresca.', 8.99, 250),
('Hamburguesa Clásica', 'Hamburguesa de carne de res con lechuga, tomate, cebolla y mayonesa.', 6.49, 350),
('Ensalada César', 'Ensalada con lechuga romana, pollo a la parrilla, crutones y aderezo César.', 7.99, 300),
('Sushi de Atún', 'Sushi con arroz, atún fresco y algas nori.', 12.50, 200),
('Tacos al Pastor', 'Tacos con carne de cerdo adobada, piña y cilantro fresco.', 5.99, 450),
('Spaghetti Bolognese', 'Pasta con salsa de carne, tomate y especias.', 10.99, 600),
('Pollo Asado', 'Pollo marinado en especias y asado al horno.', 11.49, 400),
('Pescado a la Parrilla', 'Pescado fresco a la parrilla, acompañado de vegetales asados.', 14.00, 350),
('Sopa de Lentejas', 'Sopa de lentejas con zanahorias, cebolla y ajo.', 4.50, 150),
('Pasta Alfredo', 'Pasta con una cremosa salsa Alfredo de queso parmesano y mantequilla.', 9.50, 700),
('Burrito de Carne', 'Burrito relleno de carne de res, arroz, frijoles y guacamole.', 8.25, 500),
('Pollo Frito', 'Pechuga de pollo empanada y frita, acompañada de papas fritas.', 7.99, 600),
('Falafel', 'Bocaditos fritos de garbanzos, hierbas y especias, acompañados de salsa de yogur.', 5.00, 350),
('Tortilla Española', 'Tortilla de patatas con cebolla y huevo, típica de España.', 6.75, 400),
('Enchiladas Verdes', 'Enchiladas rellenas de pollo y bañadas en salsa verde de tomatillo.', 9.00, 450);
