package playwright.websocket

import com.google.gson.JsonElement
import com.google.gson.JsonObject

data class Message(
    val id: Int,
    val guid: String,
    val method: String,
    val params: JsonObject,
    val result: JsonElement
) {

    override fun toString(): String {
        return "Message(\nid=$id, \nguid='$guid', \nmethod='$method', \nparams=$params, \nresult=$result\n)"
    }

}