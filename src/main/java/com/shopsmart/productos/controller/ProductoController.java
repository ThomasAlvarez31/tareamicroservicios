package com.shopsmart.productos.controller;

import com.shopsmart.productos.model.Producto;
import com.shopsmart.productos.service.ProductoService;

import io.swagger.v3.oas.annotations.Operation;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/productos")
public class ProductoController {

    private final ProductoService productoService;

    public ProductoController(ProductoService productoService) {
        this.productoService = productoService;
    }

    @Operation(summary = "Obtener todos los productos")
    @GetMapping
    public List<Producto> listarProductos() {
        return productoService.obtenerProductos();
    }

    @Operation(summary = "Agregar un nuevo producto")
    @PostMapping
    public Producto agregarProducto(@RequestBody Producto producto) {
        return productoService.agregarProducto(producto);
    }

}