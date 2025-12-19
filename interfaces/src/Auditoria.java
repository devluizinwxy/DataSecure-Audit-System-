public sealed interface Auditoria permits AuditoriaFinanceira,AuditoriaDeSeguranca{
   void gerarRelatorio(String caminhoLog);
}
