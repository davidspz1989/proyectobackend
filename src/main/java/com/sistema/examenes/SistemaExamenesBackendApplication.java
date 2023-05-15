package com.sistema.examenes;

import com.sistema.examenes.entidades.Rol;
import com.sistema.examenes.entidades.Usuario;
import com.sistema.examenes.entidades.UsuarioRol;
import com.sistema.examenes.exceptions.UserFoundException;
import com.sistema.examenes.servicios.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class SistemaExamenesBackendApplication implements CommandLineRunner {

	@Autowired
	private UsuarioService usuarioService;

	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	public static void main(String[] args) {
		SpringApplication.run(SistemaExamenesBackendApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
/*
		try{
			Usuario usuario=new Usuario();

			usuario.setNombre("Admin");
			usuario.setApellido("administrador");
			usuario.setUsername("admin");
			usuario.setPassword(this.bCryptPasswordEncoder.encode("123"));
			// usuario.setPassword("12345");
			usuario.setEmail("admin@mail.com");
			usuario.setTelefono("00000000");
			usuario.setPerfil("admin.png");

			Rol rol=new Rol();
			rol.setRolId(1L);
			rol.setName("ADMIN");

			Set<UsuarioRol> usuarioRoles=new HashSet<>();
			UsuarioRol usuarioRol=new UsuarioRol();
			usuarioRol.setRol(rol);
			usuarioRol.setUsuario(usuario);
			usuarioRoles.add(usuarioRol);

			Usuario usuarioGuardado=usuarioService.guardarUsuario(usuario, usuarioRoles);
			System.out.println(usuarioGuardado.getUsername());
		}catch (UserFoundException userFoundException){
			userFoundException.printStackTrace();
		}
*/
	}
}
