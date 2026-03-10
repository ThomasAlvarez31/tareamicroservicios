package com.shopsmart.productos.service;

import com.shopsmart.productos.model.Producto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductoService {

    private List<Producto> productos = new ArrayList<>();

    public List<Producto> obtenerProductos() {
        return productos;
    }

    public Producto agregarProducto(Producto producto) {
        productos.add(producto);
        return producto;
    }

}