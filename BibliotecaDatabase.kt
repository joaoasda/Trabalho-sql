@Database(
    entities = [Livro::class, Emprestimo::class, ItemEmprestimo::class],
    version = 1,
    exportSchema = false
)
abstract class BibliotecaDatabase : RoomDatabase() {

    abstract fun livroDao(): LivroDao
    abstract fun emprestimoDao(): EmprestimoDao
    abstract fun itemEmprestimoDao(): ItemEmprestimoDao
}
