data class EmprestimoComItens(
    @Embedded val emprestimo: Emprestimo,

    @Relation(
        parentColumn = "id",
        entityColumn = "emprestimoId"
    )
    val itens: List<ItemEmprestimo>
)
