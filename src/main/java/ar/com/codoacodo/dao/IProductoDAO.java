package ar.com.codoacodo.dao;

public interface IProductoDAO {

	public Producto getById(Long id);
	//select * from producto where id = id
	
	public Producto[] findAll();
	//select * from producto
	
	public void delete(Long id);
	//delete from producto where id = id
	
	public void update(Producto producto);
	//update producto
	//set campo1 = valor1.....
	//where id = producto.id
	public void create(producto newProduct);
	//insert into producto (campo1, campon...)
	//values(newProducto.campo1, ...newProducto.campon)
}
