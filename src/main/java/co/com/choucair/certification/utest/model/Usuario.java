package co.com.choucair.certification.utest.model;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {

    private String casoPrueba = "CP001";
    private String nombre = "Miguel";
    private String apellido = "Ortiz";
    private String email = "foo@gmail.com";
    private String ciudad = "Bogotá";
    private String codigoPostal = "110421";
    private String pais = "Colombia";
    private String diaCumpleaños = "number:1";
    private String mesCumpleaños = "number:12";
    private String añoCumpleaños = "number:2002";
    private String computador = "macOS";
    private String versionComputador = "Catalina 10.15.7";
    private String lenguajeComputador = "English";
    private String sistemaOperativoCelular = "Apple";
    private String modeloCelular = "iPhone 8";
    private String versionSistemaOperativo = "iOS 12.0";
    private String password = "Miguel1234.";

    public String getCasoPrueba() {
        return this.casoPrueba;
    }

    public void setCasoPrueba(String casoPrueba) {
        this.casoPrueba = casoPrueba;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCiudad() {
        return this.ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCodigoPostal() {
        return this.codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getPais() {
        return this.pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getDiaCumpleaños() {
        return this.diaCumpleaños;
    }

    public void setDiaCumpleaños(String diaCumpleaños) {
        this.diaCumpleaños = diaCumpleaños;
    }

    public String getMesCumpleaños() {
        return this.mesCumpleaños;
    }

    public void setMesCumpleaños(String mesCumpleaños) {
        this.mesCumpleaños = mesCumpleaños;
    }

    public String getAñoCumpleaños() {
        return this.añoCumpleaños;
    }

    public void setAñoCumpleaños(String añoCumpleaños) {
        this.añoCumpleaños = añoCumpleaños;
    }

    public String getComputador() {
        return this.computador;
    }

    public void setComputador(String computador) {
        this.computador = computador;
    }

    public String getVersionComputador() {
        return this.versionComputador;
    }

    public void setVersionComputador(String versionComputador) {
        this.versionComputador = versionComputador;
    }

    public String getLenguajeComputador() {
        return this.lenguajeComputador;
    }

    public void setLenguajeComputador(String lenguajeComputador) {
        this.lenguajeComputador = lenguajeComputador;
    }

    public String getSistemaOperativoCelular() {
        return this.sistemaOperativoCelular;
    }

    public void setSistemaOperativoCelular(String sistemaOperativoCelular) {
        this.sistemaOperativoCelular = sistemaOperativoCelular;
    }

    public String getModeloCelular() {
        return this.modeloCelular;
    }

    public void setModeloCelular(String modeloCelular) {
        this.modeloCelular = modeloCelular;
    }

    public String getVersionSistemaOperativo() {
        return this.versionSistemaOperativo;
    }

    public void setVersionSistemaOperativo(String versionSistemaOperativo) {
        this.versionSistemaOperativo = versionSistemaOperativo;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}