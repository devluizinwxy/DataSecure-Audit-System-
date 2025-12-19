import java.io.IOException;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public final class AuditoriaDeSeguranca implements Auditoria{

    Pattern termosSeguranca = Pattern.compile(
            "\\b(login|senha|acesso|falha|autenticação|erro|alertas)\\b",
            Pattern.CASE_INSENSITIVE
    );
    @Override
    public void gerarRelatorio(String caminhoLog) {
        Path arquivo = Path.of(caminhoLog);
        Path saida = Path.of("auditoria_seguranca.txt");

       try {
           List<String> linha = Files.readAllLines(arquivo);
           for (String linhas : linha){
              if ( termosSeguranca.matcher(linhas).find()){
                  Files.writeString(saida,linhas+ System.lineSeparator(), StandardCharsets.UTF_8, StandardOpenOption.CREATE,StandardOpenOption.APPEND);

              }
           }

       } catch (IOException e) {
           throw new RuntimeException("Erro ao escrever o arquivo",e);
       }

    }
}
