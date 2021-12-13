package url;

import java.io.File;

public class App {
    public static void main(String[] args) throws Exception {
       String link = "https://www.gov.br/ans/pt-br/arquivos/assuntos/prestadores/padrao-para-troca-de-informacao-de-saude-suplementar-tiss/padrao-tiss/padrao-tiss_componente-organizacional_202111.pdf";
       
       File out = new File("C:\\Users\\VALQUIRIA\\Desktop\\ESTÁGIO\\PrimeiroProjeto\\TestandoDownload.pdf");

       new Thread(new Download(link, out)).start();



    }
}
