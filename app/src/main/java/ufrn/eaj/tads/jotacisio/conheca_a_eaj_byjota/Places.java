package ufrn.eaj.tads.jotacisio.conheca_a_eaj_byjota;

import java.util.ArrayList;
import java.util.List;

public class Places {

    private String name;
    private String departament;
    private String informations;
    private int image;
    private String resp;
    private String email;
    private String tel;
    public Places(String name, String departament, String informations, int image, String resp, String email, String tel) {
        this.name = name;
        this.departament = departament;
        this.informations = informations;
        this.image = image;
        this.resp = resp;
        this.email = email;
        this.tel = tel;
    }

    public static List<Places> getPlaces(){

        List<Places> PlaceList = new ArrayList<Places>();
        PlaceList.add(new Places("Laboratório 1",
                "Departamento: Departamento de Informática",
                "informações de 1", R.drawable.entrada_eaj,
                "Responsável: Jotacísio Araújo de Oliveira",
                "Email: jotacisio@gmail.com",
                "Contato: (84) 98888-8888"));

        PlaceList.add(new Places("Laboratório TADS",
                "Departamento: Departamento de Informática",
                "informações de 2", R.drawable.entrada_eaj,
                "Responsável: Jotacísio Araújo de Oliveira",
                "Email: jotacisio@gmail.com",
                "Contato: (84) 98888-8888"));

        PlaceList.add(new Places("Laboratório Tapioca",
                "Departamento: Departamento de Informática",
                "informações de 3", R.drawable.entrada_eaj,
                "Responsável: Jotacísio Araújo de Oliveira",
                "Email: jotacisio@gmail.com",
                "Contato: (84) 98888-8888"));

        PlaceList.add(new Places("Biblioteca Setorial",
                "Departamento: Biblioteca",
                "informações de 4", R.drawable.entrada_eaj,
                "Responsável: Jotacísio Araújo de Oliveira",
                "Email: jotacisio@gmail.com",
                "Contato: (84) 98888-8888"));

        PlaceList.add(new Places("Centro Vocacional Tecnológico",
                "Departamento: CVT",
                "informações de 5", R.drawable.entrada_eaj,
                "Responsável: Jotacísio Araújo de Oliveira",
                "Email: jotacisio@gmail.com",
                "Contato: (84) 98888-8888"));

        PlaceList.add(new Places("Restaurante Universitário",
                "Departamento: RU",
                "informações de 6", R.drawable.entrada_eaj,
                "Responsável: Jotacísio Araújo de Oliveira",
                "Email: jotacisio@gmail.com",
                "Contato: (84) 98888-8888"));

        PlaceList.add(new Places("Auditório",
                "Departamento: Ensino Médio",
                "informações de 7", R.drawable.entrada_eaj,
                "Responsável: Jotacísio Araújo de Oliveira",
                "Email: jotacisio@gmail.com",
                "Contato: (84) 98888-8888"));

        PlaceList.add(new Places("Direção",
                "Departamento: Direção",
                "informações de 8", R.drawable.entrada_eaj,
                "Responsável: Jotacísio Araújo de Oliveira",
                "Email: jotacisio@gmail.com",
                "Contato: (84) 98888-8888"));
        return PlaceList;
    }

    public String getName() { return name; }
    public String getDepartament() { return departament; }
    public String getInformations() { return informations; }
    public int getImage() { return image; }
    public String getResp() { return resp; }
    public String getEmail() { return email; }
    public String getTel() { return tel; }
}
