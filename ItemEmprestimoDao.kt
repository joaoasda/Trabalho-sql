@Dao
interface ItemEmprestimoDao {

    @Query("SELECT * FROM item_emprestimo WHERE emprestimoId = :id")
    suspend fun getByEmprestimo(id: Int): List<ItemEmprestimo>

    @Insert
    suspend fun insert(item: ItemEmprestimo)
}
