package co.edu.uniquindio.compiladores.app

class Aplicacion : Application() {
    override fun start(stage: Stage) {
        val fxmlLoader = FXMLLoader(HelloApplication::class.java.getResource("app.fxml"))
        val scene = Scene(fxmlLoader.load())
        stage.title = "Hello!"
        stage.scene = scene
        stage.isResizable = false
        stage.show()
    }
}

fun main() {
    Application.launch(HelloApplication::class.java)
    val lexico = AnalizadorLexico("12333333333")
    print(lexico.listaTokens)
}