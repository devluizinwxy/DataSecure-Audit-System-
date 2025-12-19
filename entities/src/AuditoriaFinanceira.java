import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.regex.Pattern;

public final class AuditoriaFinanceira implements Auditoria{
   Pattern valores_monetários = Pattern.compile(
           "\\b(R\\$|USD|\\$)\\b"
           ,Pattern.CASE_INSENSITIVE
   );
    @Override
    public void gerarRelatorio(String caminhoLog) {
        Path arquivo = Path.of(caminhoLog);
        Path saida = Path.of("auditoria_financeira.txt");
        try{
            List<String> linha = Files.readAllLines(arquivo);
            for (String linhas : linha){
                if(valores_monetários.matcher(linhas).find()){
                    Files.writeString(saida,linhas+ System.lineSeparator(), StandardCharsets.UTF_8, StandardOpenOption.CREATE,StandardOpenOption.APPEND);
                }
            }

        } catch (IOException e) {
            throw new RuntimeException("Erro ao escrever o arquivo",e);
        }
    }
}
