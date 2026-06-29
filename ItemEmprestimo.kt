@Entity(
    tableName = "item_emprestimo"
)
data class ItemEmprestimo(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val emprestimoId: Int,
    val livroId: Int,
    val quantidade: Int
)
