(window["canvasWebpackJsonp"]=window["canvasWebpackJsonp"]||[]).push([[69,623,678],{"0crz":function(e,t,n){"use strict"
var i=n("ouhR")
var s=n.n(i)
var a=n("pQTu")
var o=n("m0r6")
Object(o["a"])(JSON.parse('{"ar":{"lib":{"text_helper":{"ellipsis":"...","quoted_text_toggle":"إظهار النص المقتبس","word_separator":" "}}},"cy":{"lib":{"text_helper":{"ellipsis":"...","quoted_text_toggle":"dangos testun wedi’i ddyfynnu","word_separator":" "}}},"da":{"lib":{"text_helper":{"ellipsis":"...","quoted_text_toggle":"vis tekst i gåseøjne","word_separator":" "}}},"da-x-k12":{"lib":{"text_helper":{"ellipsis":"...","quoted_text_toggle":"vis tekst i gåseøjne","word_separator":" "}}},"de":{"lib":{"text_helper":{"ellipsis":"...","quoted_text_toggle":"zitierten Text zeigen","word_separator":" "}}},"el":{"lib":{"text_helper":{"ellipsis":"...","quoted_text_toggle":"προβολή κειμένου που παρατίθεται"}}},"en-AU":{"lib":{"text_helper":{"ellipsis":"...","quoted_text_toggle":"show quoted text","word_separator":" "}}},"en-AU-x-unimelb":{"lib":{"text_helper":{"ellipsis":"...","quoted_text_toggle":"show quoted text","word_separator":" "}}},"en-CA":{"lib":{"text_helper":{"ellipsis":"...","quoted_text_toggle":"show quoted text","word_separator":" "}}},"en-GB":{"lib":{"text_helper":{"ellipsis":"...","quoted_text_toggle":"show quoted text","word_separator":" "}}},"en-GB-x-lbs":{"lib":{"text_helper":{"ellipsis":"...","quoted_text_toggle":"show quoted text","word_separator":" "}}},"en-GB-x-ukhe":{"lib":{"text_helper":{"ellipsis":"...","quoted_text_toggle":"show quoted text","word_separator":" "}}},"es":{"lib":{"text_helper":{"ellipsis":"...","quoted_text_toggle":"mostrar texto citado","word_separator":" "}}},"fa":{"lib":{"text_helper":{"ellipsis":"...","quoted_text_toggle":"نمایش متن نقل شده","word_separator":" "}}},"fi":{"lib":{"text_helper":{"ellipsis":"...","quoted_text_toggle":"näytä lainattu teksti","word_separator":" "}}},"fr":{"lib":{"text_helper":{"ellipsis":"...","quoted_text_toggle":"afficher le texte entre guillemets","word_separator":" "}}},"fr-CA":{"lib":{"text_helper":{"ellipsis":"...","quoted_text_toggle":"afficher le texte entre guillemets","word_separator":" "}}},"he":{"lib":{"text_helper":{"ellipsis":"...","quoted_text_toggle":"מציג ציטוט","word_separator":" "}}},"ht":{"lib":{"text_helper":{"ellipsis":"...","quoted_text_toggle":"afiche tèks site","word_separator":" "}}},"hu":{"lib":{"text_helper":{"ellipsis":"...","quoted_text_toggle":"idézett szöveg megjelenítése","word_separator":" "}}},"hy":{"lib":{"text_helper":{"ellipsis":"...","quoted_text_toggle":"ցույց տալ մեջբերվող տեքստը","word_separator":"-"}}},"is":{"lib":{"text_helper":{"ellipsis":"...","quoted_text_toggle":"Sýna ívitnaðan texta","word_separator":" "}}},"it":{"lib":{"text_helper":{"ellipsis":"...","quoted_text_toggle":"mostra testo citato","word_separator":" "}}},"ja":{"lib":{"text_helper":{"ellipsis":"...","quoted_text_toggle":"引用したテキストを表示","word_separator":" "}}},"ko":{"lib":{"text_helper":{"ellipsis":"...","quoted_text_toggle":"인용된 텍스트 표시","word_separator":" "}}},"mi":{"lib":{"text_helper":{"ellipsis":"...","quoted_text_toggle":"whakaatu kuputuhi faahiti","word_separator":"-"}}},"nb":{"lib":{"text_helper":{"ellipsis":"...","quoted_text_toggle":"vis den merkede teksten","word_separator":" "}}},"nb-x-k12":{"lib":{"text_helper":{"ellipsis":"...","quoted_text_toggle":"vis den merkede teksten","word_separator":" "}}},"nl":{"lib":{"text_helper":{"ellipsis":"...","quoted_text_toggle":"geciteerde tekst tonen","word_separator":" "}}},"nn":{"lib":{"text_helper":{"ellipsis":"...","quoted_text_toggle":"vis sitert tekst","word_separator":" "}}},"pl":{"lib":{"text_helper":{"ellipsis":"...","quoted_text_toggle":"pokaż cytowany fragment tekstu","word_separator":" "}}},"pt":{"lib":{"text_helper":{"ellipsis":"...","quoted_text_toggle":"exibir texto citado","word_separator":" "}}},"pt-BR":{"lib":{"text_helper":{"ellipsis":"...","quoted_text_toggle":"exibir texto citado","word_separator":" "}}},"ru":{"lib":{"text_helper":{"ellipsis":"...","quoted_text_toggle":"показать цитированный текст","word_separator":" "}}},"sl":{"lib":{"text_helper":{"ellipsis":"...","quoted_text_toggle":"prikaži citirano besedilo","word_separator":" "}}},"sv":{"lib":{"text_helper":{"ellipsis":"...","quoted_text_toggle":"visa citerad text","word_separator":" "}}},"sv-x-k12":{"lib":{"text_helper":{"ellipsis":"...","quoted_text_toggle":"visa citerad text","word_separator":" "}}},"tr":{"lib":{"text_helper":{"ellipsis":"...","quoted_text_toggle":"alıntılanan metni göster","word_separator":" "}}},"uk":{"lib":{"text_helper":{"ellipsis":"...","quoted_text_toggle":"Показати цитований текст","word_separator":" "}}},"zh-Hans":{"lib":{"text_helper":{"ellipsis":"...","quoted_text_toggle":"显示引用的文本","word_separator":" "}}},"zh-Hant":{"lib":{"text_helper":{"ellipsis":"...","quoted_text_toggle":"顯示引用的文字","word_separator":" "}}}}'))
n("jQeR")
n("0sPK")
var r=a["default"].scoped("lib.text_helper")
var l=n("5Ky4")
var c,u,d
c="LINK-PLACEHOLDER"
u=/\b((?:https?:\/\/|www\d{0,3}[.]|[a-z0-9.\-]+[.][a-z]{2,4}\/)(?:[^\s()<>]+|\([^\s()<>]*\))+(?:\([^\s()<>]*\)|[^\s`!()\[\]{};:'".,<>?«»“”‘’]))|(LINK-PLACEHOLDER)/gi
t["a"]=d={quoteClump:function(e){return"<div class='quoted_text_holder'> <a href='#' class='show_quoted_text_link'>"+Object(l["a"])(r.t("quoted_text_toggle","show quoted text"))+"</a> <div class='quoted_text' style='display: none;'> "+s.a.raw(e.join("\n"))+" </div> </div>"},formatMessage:function(e){var t,n,i,s,a,o,r,h
s=[]
a=[]
e=e.replace(u,(function(e,t){var n
a.push(e===c?c:(n=e,"http://"===n.slice(0,7)||"https://"===n.slice(0,8)||(n="http://"+n),s.push(n),"<a href='"+Object(l["a"])(n)+"'>"+Object(l["a"])(e)+"</a>"))
return c}))
e=Object(l["a"])(e)
e=e.replace(new RegExp(c,"g"),(function(e,t){return a.shift()}))
e=e.replace(/\n/g,"<br />\n")
o=[]
r=[]
h=e.split("\n")
for(t=0,n=h.length;t<n;t++){i=h[t]
if(i.match(/^(&gt;|>)/))r.push(i)
else{r.length&&o.push(d.quoteClump(r))
r=[]
o.push(i)}}r.length&&o.push(d.quoteClump(r))
return o.join("\n")},delimit:function(e){var t,n,i,s,a
if(isNaN(e))return String(e)
a=e<0?"-":""
t=Math.abs(e)
if(Infinity===t)return String(e)
n=Math.floor(t)
s=t===n?"":String(t).replace(/^\d+\./,".")
while(n>=1e3){i=String(n).replace(/\d+(\d\d\d)$/,",$1")
n=Math.floor(n/1e3)
s=i+s}return a+String(n)+s},truncateText:function(e,t){var n,i,s,a,o,l
null==t&&(t={})
i=null!=(a=t.max)?a:30
n=r.t("ellipsis","...")
l=r.t("word_separator"," ")
e=(null!=e?e:"").replace(/\s+/g,l).trim()
if(!e||e.length<=i)return e
o=0
while(true){s=e.indexOf(l,o+1)
if(s<0||s>i-n.length)break
o=s}o||(o=i-n.length)
return e.substring(0,o)+n},plainText:function(e){return e.replace(/(<([^>]+)>)/gi,"")}}},B1vq:function(e,t,n){"use strict"
var i=n("ouhR")
var s=n.n(i)
n("s/PJ")
s.a.fn.scrollToVisible=function(e){const t={}
const n=s()(e)
if(0===n.length)return
let i=n.offset(),a=n.outerWidth(),o=n.outerHeight(),r=i.top,l=r+o,c=i.left,u=c+a,d="html,body"==this.selector?s.a.windowScrollTop():this.scrollTop(),h=this.scrollLeft(),_=this.outerHeight(),f=this.outerWidth()
if("html,body"!=this.selector){let e=s()("body").offset()
this.each((function(){try{e=s()(this).offset()
return false}catch(e){}}))
r-=e.top
l-=e.top
c-=e.left
u-=e.left}if("HTML"==this[0].tagName||"BODY"==this[0].tagName){_=s()(window).height()
s()("#wizard_box:visible").length>0&&(_-=s()("#wizard_box:visible").height())
f=s()(window).width()
r-=d
c-=h
l-=d
u-=h}r<0||_<o&&l>_?t.scrollTop=r+d:l>_&&(t.scrollTop=l+d-_+20)
c<0?t.scrollLeft=c+h:u>f&&(t.scrollLeft=u+h-f+20)
1==t.scrollTop&&(t.scrollTop=0)
1==t.scrollLeft&&(t.scrollLeft=0)
this.scrollTop(t.scrollTop)
this.scrollLeft(t.scrollLeft)
return this}},"EvX+":function(e,t,n){"use strict"
var i=n("HIhM")
const s={}
const a={getCssVariant(){const e=window.ENV.use_responsive_layout?"responsive_layout":"new_styles"
const t=window.ENV.use_high_contrast?"high_contrast":"normal_contrast"
const n=Object(i["c"])()?"_rtl":""
return"".concat(e,"_").concat(t).concat(n)},urlFor(e,t){let n=t.combinedChecksum,i=t.includesNoVariables
const s=i?"no_variables":a.getCssVariant()
return[window.ENV.ASSET_HOST||"","dist","brandable_css",s,"".concat(e,"-").concat(n,".css")].join("/")},loadStylesheet(e,t){if(e in s)return
const n=document.createElement("link")
n.rel="stylesheet"
n.href=a.urlFor(e,t)
n.setAttribute("data-loaded-by-brandableCss",true)
document.head.appendChild(n)
window.canvasCssVariablesPolyfill&&window.canvasCssVariablesPolyfill(n)}}
t["a"]=a},WEIH:function(e,t,n){"use strict"
n.d(t,"a",(function(){return c}))
var i=n("ouhR")
var s=n.n(i)
function a(e,t){e.top<0&&(e.top=0)
return s()(this).css(e).toggleClass("carat-bottom","bottom"===t.vertical)}let o=0
const r=[]
function l(e){const t=e.querySelectorAll('a[href], button, textarea, input[type="text"], input[type="radio"], input[type="checkbox"], select')
const n=t[0]
const i=t[t.length-1]
const s=9
e.addEventListener("keydown",e=>{const t="Tab"===e.key||e.keyCode===s
if(!t)return
if(e.shiftKey){if(document.activeElement===n){i.focus()
e.preventDefault()}}else if(document.activeElement===i){setTimeout(()=>{n.focus()})
e.preventDefault()}})}class c{constructor(e,t){let n=arguments.length>2&&void 0!==arguments[2]?arguments[2]:{}
this.ignoreOutsideClickSelector=".ui-dialog"
this.outsideClickHandler=e=>{s()(e.target).closest(this.el.add(this.trigger).add(this.ignoreOutsideClickSelector)).length||this.hide()}
this.position=()=>this.el.position({my:"center ".concat("bottom"===this.options.verticalSide?"top":"bottom"),at:"center ".concat(this.options.verticalSide||"top"),of:this.trigger,offset:"0px ".concat(this.offsetPx(),"px"),within:"body",collision:"flipfit ".concat(this.options.verticalSide?"none":"flipfit"),using:a})
this.content=t
this.options=n
this.trigger=s()(e.currentTarget)
this.triggerAction=e.type
this.focusTrapped=false
this.el=s()(this.content).addClass("carat-bottom").data("popover",this).keydown(e=>{e.keyCode===s.a.ui.keyCode.ESCAPE&&this.hide()
if(e.keyCode!==s.a.ui.keyCode.TAB)return
const t=s()(":tabbable",this.el)
const n=s.a.inArray(e.target,t)
if(-1===n)return
e.shiftKey?this.focusTrapped||0!==n||this.hide():this.focusTrapped||n!==t.length-1||this.hide()})
this.el.delegate(".popover_close","keyclick click",e=>{e.preventDefault()
this.hide()})
this.show(e)}trapFocus(e){this.focusTrapped=true
l(e)}show(e){let t
s.a.screenReaderFlashMessageExclusive("")
while(t=r.pop())t.hide()
r.push(this)
const n="popover-".concat(o++)
this.trigger.attr({"aria-expanded":true,"aria-controls":n})
this.previousTarget=e.currentTarget
this.el.attr({id:n}).appendTo(document.body).show()
this.position()
if("mouseenter"!==e.type){this.el.find(":tabbable").first().focus()
setTimeout(()=>this.el.find(":tabbable").first().focus(),100)}document.querySelector("#application").setAttribute("aria-hidden","true")
this.el.find(".ui-menu-carat").remove()
const i=this.options.manualOffset||0
const a=this.trigger.offset().left-this.el.offset().left
const l=e.pageX-this.trigger.offset().left
const c=Math.max(0,this.trigger.width()/2-this.el.width()/2)+20
const u=this.trigger.width()-c
const d=Math.min(Math.max(c,l),u)+a+i
s()('<span class="ui-menu-carat"><span /></span>').css("left",d).prependTo(this.el)
this.positionInterval=setInterval(this.position,200)
s()(window).click(this.outsideClickHandler)}hide(){for(let e=0;e<r.length;e++){const t=r[e]
this===t&&r.splice(e,1)}this.el.detach()
this.trigger.attr("aria-expanded",false)
clearInterval(this.positionInterval)
s()(window).unbind("click",this.outsideClickHandler)
this.restoreFocus()
0===r.length&&document.querySelector("#application").setAttribute("aria-hidden","false")}offsetPx(){const e="bottom"===this.options.verticalSide?10:-10
return this.options.invertOffset?-1*e:e}restoreFocus(){this.previousTarget&&s()(this.previousTarget).is(":visible")&&this.previousTarget.focus()}}},fNL0:function(e,t,n){"use strict"
var i=n("ouhR")
var s=n.n(i)
n("JI1W")
const a={globalEnv:window.ENV}
function o(e){for(var t=arguments.length,n=new Array(t>1?t-1:0),i=1;i<t;i++)n[i-1]=arguments[i]
return function(t,i){const s=JSON.stringify(i)
const o=n.map(e=>a.globalEnv[e]).join("_")
const r=localStorage["".concat(e,"Item")]("_".concat(o,"_").concat(t),s)
if("undefined"===r)return
if(r)return JSON.parse(r)}}["get","set","remove"].forEach(e=>{a[e]=o(e,"current_user_id")
a["context".concat(s.a.capitalize(e))]=o(e,"current_user_id","context_asset_string")})
t["a"]=a},p6Wi:function(e,t,n){"use strict"
var i=n("pQTu")
var s=n("m0r6")
Object(s["a"])(JSON.parse('{"ar":{"buttons":{"cancel":"إلغاء","delete":"حذف"},"instructure_misc_plugins":{"confirms":{"default_delete_thing":"هل ترغب بالتأكيد في حذف هذا؟"}}},"cy":{"buttons":{"cancel":"Canslo","delete":"Dileu"},"instructure_misc_plugins":{"confirms":{"default_delete_thing":"Ydych chi’n siŵr eich bod am ddileu hyn?"}}},"da":{"buttons":{"cancel":"Annuller","delete":"Slet"},"instructure_misc_plugins":{"confirms":{"default_delete_thing":"Er du sikker på, at du vil slette dette?"}}},"da-x-k12":{"buttons":{"cancel":"Annuller","delete":"Slet"},"instructure_misc_plugins":{"confirms":{"default_delete_thing":"Er du sikker på, at du vil slette dette?"}}},"de":{"buttons":{"cancel":"Abbrechen","delete":"Löschen"},"instructure_misc_plugins":{"confirms":{"default_delete_thing":"Möchten Sie dies wirklich löschen?"}}},"el":{"buttons":{"cancel":"Ακύρωση","delete":"Διαγραφή"},"instructure_misc_plugins":{"confirms":{"default_delete_thing":"Είστε σίγουρος/η ότι επιθυμείτε να το διαγράψετε;"}}},"en-AU":{"buttons":{"cancel":"Cancel","delete":"Delete"},"instructure_misc_plugins":{"confirms":{"default_delete_thing":"Are you sure you want to delete this?"}}},"en-AU-x-unimelb":{"buttons":{"cancel":"Cancel","delete":"Delete"},"instructure_misc_plugins":{"confirms":{"default_delete_thing":"Are you sure you want to delete this?"}}},"en-CA":{"buttons":{"cancel":"Cancel","delete":"Delete"},"instructure_misc_plugins":{"confirms":{"default_delete_thing":"Are you sure you want to delete this?"}}},"en-GB":{"buttons":{"cancel":"Cancel","delete":"Delete"},"instructure_misc_plugins":{"confirms":{"default_delete_thing":"Are you sure you want to delete this?"}}},"en-GB-x-lbs":{"buttons":{"cancel":"Cancel","delete":"Delete"}},"en-GB-x-ukhe":{"buttons":{"cancel":"Cancel","delete":"Delete"},"instructure_misc_plugins":{"confirms":{"default_delete_thing":"Are you sure you want to delete this?"}}},"es":{"buttons":{"cancel":"Cancelar","delete":"Eliminar"},"instructure_misc_plugins":{"confirms":{"default_delete_thing":"¿Seguro que desea eliminarlo?"}}},"fa":{"buttons":{"cancel":"لغو","delete":"حذف"},"instructure_misc_plugins":{"confirms":{"default_delete_thing":"مطمئنید که می خواهید این مورد حذف شود؟"}}},"fi":{"buttons":{"cancel":"Peruuta","delete":"Poista"},"instructure_misc_plugins":{"confirms":{"default_delete_thing":"Haluatko varmasti poistaa tämän?"}}},"fr":{"buttons":{"cancel":"Annuler","delete":"Supprimer"},"instructure_misc_plugins":{"confirms":{"default_delete_thing":"Voulez-vous vraiment supprimer cet élément ?"}}},"fr-CA":{"buttons":{"cancel":"Annuler","delete":"Supprimer"},"instructure_misc_plugins":{"confirms":{"default_delete_thing":"Voulez-vous vraiment supprimer cet élément?"}}},"he":{"buttons":{"cancel":"ביטול","delete":"ביטול"},"instructure_misc_plugins":{"confirms":{"default_delete_thing":"בטוח/ה שרוצה לבטל זאת?"}}},"ht":{"buttons":{"cancel":"Anile","delete":"Efase"},"instructure_misc_plugins":{"confirms":{"default_delete_thing":"Ou kwè vrèman ou vle efase sa a?"}}},"hu":{"buttons":{"cancel":"Mégse","delete":"Törlés"},"instructure_misc_plugins":{"confirms":{"default_delete_thing":"Biztos benne, hogy törli ezt?"}}},"hy":{"buttons":{"cancel":"Չեղյալ համարել","delete":"Ջնջել"},"instructure_misc_plugins":{"confirms":{"default_delete_thing":"Դուք իսկապե՞ս ցանկանում եք ջնջել սա:"}}},"is":{"buttons":{"cancel":"Hætta við","delete":"Eyða"},"instructure_misc_plugins":{"confirms":{"default_delete_thing":"Viltu örugglega eyða þessu?"}}},"it":{"buttons":{"cancel":"Annulla","delete":"Elimina"},"instructure_misc_plugins":{"confirms":{"default_delete_thing":"Vuoi eliminare questo?"}}},"ja":{"buttons":{"cancel":"キャンセル","delete":"削除"},"instructure_misc_plugins":{"confirms":{"default_delete_thing":"これを削除してもよろしいですか?"}}},"ko":{"buttons":{"cancel":"취소","delete":"삭제"},"instructure_misc_plugins":{"confirms":{"default_delete_thing":"삭제하시겠습니까?"}}},"mi":{"buttons":{"cancel":"Whakakore","delete":"Muku"},"instructure_misc_plugins":{"confirms":{"default_delete_thing":"E tino hiahia ana koe ki te muku i tēnei?"}}},"nb":{"buttons":{"cancel":"Avbryt","delete":"Slett"},"instructure_misc_plugins":{"confirms":{"default_delete_thing":"Er du sikker på at du ønsker å slette dette?"}}},"nb-x-k12":{"buttons":{"cancel":"Avbryt","delete":"Slett"},"instructure_misc_plugins":{"confirms":{"default_delete_thing":"Er du sikker på at du ønsker å slette dette?"}}},"nl":{"buttons":{"cancel":"Annuleren","delete":"Verwijderen"},"instructure_misc_plugins":{"confirms":{"default_delete_thing":"Weet je zeker dat je dit wilt verwijderen?"}}},"nn":{"buttons":{"cancel":"Avbryt","delete":"Slett"},"instructure_misc_plugins":{"confirms":{"default_delete_thing":"Er du sikker på at du vil slette dette?"}}},"pl":{"buttons":{"cancel":"Anuluj","delete":"Usuń"},"instructure_misc_plugins":{"confirms":{"default_delete_thing":"Czy na pewno chcesz usunąć ten element?"}}},"pt":{"buttons":{"cancel":"Cancelar","delete":"Excluir"},"instructure_misc_plugins":{"confirms":{"default_delete_thing":"Tem certeza de que deseja excluir isto?"}}},"pt-BR":{"buttons":{"cancel":"Cancelar","delete":"Excluir"},"instructure_misc_plugins":{"confirms":{"default_delete_thing":"Tem certeza que deseja excluir isto?"}}},"ru":{"buttons":{"cancel":"Отменить","delete":"Удалить"},"instructure_misc_plugins":{"confirms":{"default_delete_thing":"Действительно хотите удалить?"}}},"sl":{"buttons":{"cancel":"Prekliči","delete":"Odstrani"}},"sv":{"buttons":{"cancel":"Avbryt","delete":"Radera"},"instructure_misc_plugins":{"confirms":{"default_delete_thing":"Är du säker på att du vill radera det här?"}}},"sv-x-k12":{"buttons":{"cancel":"Avbryt","delete":"Radera"}},"tr":{"buttons":{"cancel":"İptal","delete":"Sil"},"instructure_misc_plugins":{"confirms":{"default_delete_thing":"Bunu silmek istediğinize emin misiniz?"}}},"uk":{"buttons":{"cancel":"Скасувати","delete":"Видалити"}},"zh-Hans":{"buttons":{"cancel":"取消","delete":"删除"},"instructure_misc_plugins":{"confirms":{"default_delete_thing":"是否确定要删除它?"}}},"zh-Hant":{"buttons":{"cancel":"取消","delete":"刪除"},"instructure_misc_plugins":{"confirms":{"default_delete_thing":"您是否確定要刪除？"}}}}'))
n("jQeR")
n("0sPK")
var a=i["default"].scoped("instructure_misc_plugins")
var o=n("ouhR")
var r=n.n(o)
var l=n("5Ky4")
var c=n("JD5e")
n("jYyc")
n("YGE8")
n("B1vq")
n("s/PJ")
r.a.fn.setOptions=function(e,t){let n=e?"<option value=''>"+Object(l["a"])(e)+"</option>":""
null==t&&(t=[])
t.forEach(e=>{const t=Object(l["a"])(e)
n+='<option value="'+t+'">'+t+"</option>"})
return this.html(r.a.raw(n))}
r.a.fn.ifExists=function(e){this.length&&e.call(this,this)
return this}
r.a.fn.scrollbarWidth=function(){const e=r()('<div style="width:50px;height:50px;overflow:hidden;position:absolute;top:-200px;left:-200px;"><div style="height:100px;"></div>').appendTo(this),t=e.find("div")
const n=t.innerWidth()
e.css("overflow-y","scroll")
const i=t.innerWidth()
e.remove()
return n-i}
r.a.fn.dim=function(e){return this.animate({opacity:.4},e)}
r.a.fn.undim=function(e){return this.animate({opacity:1},e)}
r.a.fn.confirmDelete=function(e){e=r.a.extend({},r.a.fn.confirmDelete.defaults,e)
const t=this
let n=null
let i=true
e.noMessage=e.noMessage||e.no_message
const s=function(){if(!i){e.cancelled&&r.a.isFunction(e.cancelled)&&e.cancelled.call(t)
return}e.confirmed||(e.confirmed=function(){t.dim()})
e.confirmed.call(t)
if(e.url){e.success||(e.success=function(e){t.fadeOut("slow",()=>{t.remove()})})
const i=e.prepareData?e.prepareData.call(t,n):{}
i.authenticity_token=Object(c["a"])()
r.a.ajaxJSON(e.url,"DELETE",i,n=>{e.success.call(t,n)},(n,i,s,a)=>{e.error&&r.a.isFunction(e.error)?e.error.call(t,n,i,s,a):r.a.ajaxJSON.unhandledXHRs.push(i)})}else{e.success||(e.success=function(){t.fadeOut("slow",()=>{t.remove()})})
e.success.call(t)}}
if(e.message&&!e.noMessage&&!r.a.skipConfirmations){if(e.dialog){i=false
const t="object"===typeof e.dialog?e.dialog:{}
n=r()(e.message).dialog(r.a.extend({},{modal:true,close:s,buttons:[{text:a.t("#buttons.cancel","Cancel"),click(){r()(this).dialog("close")}},{text:a.t("#buttons.delete","Delete"),class:"btn-primary",click(){i=true
r()(this).dialog("close")}}]},t))
return}i=confirm(e.message)}s()}
r.a.fn.confirmDelete.defaults={get message(){return a.t("confirms.default_delete_thing","Are you sure you want to delete this?")}}
r.a.fn.fragmentChange=function(e){if(e&&true!==e){const n=(window.location.search||"").replace(/^\?/,"").split("&")
let i=null
for(var t=0;t<n.length;t++){const e=n[t]
e&&0===e.indexOf("hash=")&&(i="#"+e.substring(5))}this.bind("document_fragment_change",e)
const s=this
let a=false
for(t=0;t<r.a._checkFragments.fragmentList.length;t++){const e=r.a._checkFragments.fragmentList[t]
e.doc[0]==s[0]&&(a=true)}a||r.a._checkFragments.fragmentList.push({doc:s,fragment:""})
r()(window).bind("hashchange",r.a._checkFragments)
setTimeout(()=>{i&&i.length>0?s.triggerHandler("document_fragment_change",i):s&&s[0]&&s[0].location&&s[0].location.hash.length>0&&s.triggerHandler("document_fragment_change",s[0].location.hash)},500)}else this.triggerHandler("document_fragment_change",this[0].location.hash)
return this}
r.a._checkFragments=function(){const e=r.a._checkFragments.fragmentList
for(let t=0;t<e.length;t++){const n=e[t]
const i=n.doc
if(i[0].location.hash!=n.fragment){i.triggerHandler("document_fragment_change",i[0].location.hash)
n.fragment=i[0].location.hash
r.a._checkFragments.fragmentList[t]=n}}}
r.a._checkFragments.fragmentList=[]
r.a.fn.clickLink=function(){const e=this.eq(0)
e.hasClass("disabled_link")||e.click()}
r.a.fn.showIf=function(e){if(r.a.isFunction(e))return this.each((function(t){r()(this).showIf(e.call(this))}))
e?this.show():this.hide()
return this}
r.a.fn.disableIf=function(e){r.a.isFunction(e)&&(e=e.call(this))
this.prop("disabled",!!e)
return this}
r.a.fn.indicate=function(e){e=e||{}
let t
if("remove"==e){t=this.data("indicator")
t&&t.remove()
return}r()(".indicator_box").remove()
let n=this.offset()
e&&e.offset&&(n=e.offset)
const i=this.width()
const s=this.height()
const a=(e.container||this).zIndex()
t=r()(document.createElement("div"))
t.css({width:i+6,height:s+6,top:n.top-3,left:n.left-3,zIndex:a+1,position:"absolute",display:"block","-moz-border-radius":5,opacity:.8,border:"2px solid #870",backgroundColor:"#fd0"})
t.addClass("indicator_box")
t.mouseover((function(){r()(this).stop().fadeOut("fast",(function(){r()(this).remove()}))}))
this.data("indicator")&&this.indicate("remove")
this.data("indicator",t)
r()("body").append(t)
e&&e.singleFlash?t.hide().fadeIn().animate({opacity:.8},500).fadeOut("slow",(function(){r()(this).remove()})):t.hide().fadeIn().animate({opacity:.8},500).fadeOut("slow").fadeIn("slow").animate({opacity:.8},2500).fadeOut("slow",(function(){r()(this).remove()}))
e&&e.scroll&&r()("html,body").scrollToVisible(t)}
r.a.fn.hasScrollbar=function(){return this.length&&this[0].clientHeight<this[0].scrollHeight}
r.a.fn.log=function(e){console.log("%s: %o",e,this)
return this}
r.a.fn.fillWindowWithMe=function(e){const t=r.a.extend({minHeight:400},e),n=r()(this),i=r()("#wrapper"),s=r()("#main"),a=r()("#not_right_side"),o=r()(window),l=r()(this).add(t.alsoResize)
function c(){l.height(0)
const e=o.height()-(i.offset().top+i.outerHeight())+(s.height()-a.height()),c=Math.max(400,e)
l.height(c)
r.a.isFunction(t.onResize)&&t.onResize.call(n,c)}c()
o.unbind("resize.fillWindowWithMe").bind("resize.fillWindowWithMe",c)
return this}
r.a.fn.autoGrowInput=function(e){e=r.a.extend({maxWidth:1e3,minWidth:0,comfortZone:70},e)
this.filter("input:text").each((function(){let t=e.minWidth||r()(this).width(),n="",i=r()(this),s=r()("<tester/>").css({position:"absolute",top:-9999,left:-9999,width:"auto",fontSize:i.css("fontSize"),fontFamily:i.css("fontFamily"),fontWeight:i.css("fontWeight"),letterSpacing:i.css("letterSpacing"),whiteSpace:"nowrap"}),a=function(){setTimeout(()=>{if(n===(n=i.val()))return
s.text(n)
const a=s.width(),o=a+e.comfortZone>=t?a+e.comfortZone:t,r=i.width(),l=o<r&&o>=t||o>t&&o<e.maxWidth
l&&i.width(o)})}
s.insertAfter(i)
r()(this).bind("keyup keydown blur update change",a)}))
return this}
r.a},ppAs:function(e,t,n){"use strict"
var i=n("ouhR")
var s=n.n(i)
var a=n("GLiE")
var o=n.n(a)
var r=n("5Ky4")
var l=n("pQTu")
var c=n("m0r6")
Object(c["a"])(JSON.parse('{"ar":{"user_content_aaf0fb5a":"محتوى المستخدم"},"cy":{"user_content_aaf0fb5a":"Cynnwys Defnyddiwr"},"da":{"user_content_aaf0fb5a":"Brugerindhold"},"da-x-k12":{"user_content_aaf0fb5a":"Brugerindhold"},"de":{"user_content_aaf0fb5a":"Benutzer-Content"},"el":{"user_content_aaf0fb5a":"Περιεχόμενο Χρήστη"},"en-AU":{"user_content_aaf0fb5a":"User Content"},"en-AU-x-unimelb":{"user_content_aaf0fb5a":"User Content"},"en-CA":{"user_content_aaf0fb5a":"User Content"},"en-GB":{"user_content_aaf0fb5a":"User content"},"en-GB-x-lbs":{"user_content_aaf0fb5a":"User content"},"en-GB-x-ukhe":{"user_content_aaf0fb5a":"User content"},"es":{"user_content_aaf0fb5a":"Contenido del usuario"},"fa":{"user_content_aaf0fb5a":"محتوای کاربر"},"fi":{"user_content_aaf0fb5a":"Käyttäjän sisältö"},"fr":{"user_content_aaf0fb5a":"Contenu de l\'utilisateur"},"fr-CA":{"user_content_aaf0fb5a":"Contenu de l\'utilisateur"},"he":{"user_content_aaf0fb5a":"תוכן משתמש"},"ht":{"user_content_aaf0fb5a":"Kontni Itilizatè"},"hu":{"user_content_aaf0fb5a":"Felhasználói tartalom"},"is":{"user_content_aaf0fb5a":"Notandaefni"},"it":{"user_content_aaf0fb5a":"Contenuto utente"},"ja":{"user_content_aaf0fb5a":"ユーザーコンテンツ"},"mi":{"user_content_aaf0fb5a":"Ihirangi kaiwhakamahi"},"nb":{"user_content_aaf0fb5a":"Brukerinnhold"},"nb-x-k12":{"user_content_aaf0fb5a":"Brukerinnhold"},"nl":{"user_content_aaf0fb5a":"Gebruikersinhoud"},"nn":{"user_content_aaf0fb5a":"Brukarinnhald"},"pl":{"user_content_aaf0fb5a":"Zawartość użytkownika"},"pt":{"user_content_aaf0fb5a":"Conteúdo do Utilizador"},"pt-BR":{"user_content_aaf0fb5a":"Conteúdo do Usuário"},"ru":{"user_content_aaf0fb5a":"Контент пользователя"},"sl":{"user_content_aaf0fb5a":"Vsebina uporabnika"},"sv":{"user_content_aaf0fb5a":"Användarinnehåll"},"sv-x-k12":{"user_content_aaf0fb5a":"Användarinnehåll"},"tr":{"user_content_aaf0fb5a":"Kullanıcı İçeriği"},"uk":{"user_content_aaf0fb5a":"Контент користувача"},"zh-Hans":{"user_content_aaf0fb5a":"用户内容"},"zh-Hant":{"user_content_aaf0fb5a":"使用者內容"}}'))
n("jQeR")
n("0sPK")
var u=l["default"].scoped("user_content")
const d={translateMathmlForScreenreaders(e){const t=s()("<div/>").html(e.attr("x-canvaslms-safe-mathml")).html()
const n=s()('<span class="hidden-readable"></span>')
n.html(t)
return n},toMediaCommentLink(e){const t=s()("<a\n        id='media_comment_".concat(Object(r["a"])(s()(e).data("media_comment_id")),"'\n        data-media_comment_type='").concat(Object(r["a"])(s()(e).data("media_comment_type")),"'\n        class='instructure_inline_media_comment ").concat(Object(r["a"])(e.nodeName.toLowerCase()),"_comment'\n        data-alt='").concat(Object(r["a"])(s()(e).attr("data-alt")),"'\n      />"))
t.html(s()(e).html())
return t},convert(e){let t=arguments.length>1&&void 0!==arguments[1]?arguments[1]:{}
const n=s()("<div />").html(e)
n.find("video.instructure_inline_media_comment,audio.instructure_inline_media_comment").replaceWith((function(){return d.toMediaCommentLink(this)}))
n.find("object.instructure_user_content:not(#kaltura_player) embed").remove()
if(!t.forEditing){n.find("object.instructure_user_content,embed.instructure_user_content").replaceWith((function(){const e=s()(this)
if(!e.data("uc_snippet")||!e.data("uc_sig"))return this
const t=o.a.uniqueId("uc_")
let n="/object_snippet"
ENV.files_domain&&(n="//".concat(ENV.files_domain).concat(n))
const i=s()("<form\n            action='".concat(Object(r["a"])(n),"'\n            method='post'\n            class='user_content_post_form'\n            target='").concat(Object(r["a"])(t),"'\n            id='form-").concat(Object(r["a"])(t),"'\n          />"))
i.append(s()("<input type='hidden'/>").attr({name:"object_data",value:e.data("uc_snippet")}))
i.append(s()("<input type='hidden'/>").attr({name:"s",value:e.data("uc_sig")}))
s()("body").append(i)
setTimeout(()=>i.submit(),0)
return s()("<iframe\n            class='user_content_iframe'\n            name='".concat(Object(r["a"])(t),"'\n            style='width: ").concat(Object(r["a"])(e.data("uc_width")),"; height: ").concat(Object(r["a"])(e.data("uc_height")),";'\n            frameborder='0'\n            title='").concat(Object(r["a"])(u.t("User Content")),"'\n          />"))}))
n.find("img.equation_image").each((e,t)=>{const n=s()(t)
const i=d.translateMathmlForScreenreaders(n)
n.removeAttr("x-canvaslms-safe-mathml")
n.after(i)})}return n.html()}}
t["a"]=d},yE80:function(e,t,n){"use strict"
var i=n("pQTu")
t["a"]={strings(e,t){let n=i["default"].locale||"en-US"
const s={zh_Hant:"zh-Hant"}
n=s[n]||n
return e.localeCompare(t,n,{sensitivity:"variant",ignorePunctuation:false,numeric:true})},by(e){return(t,n)=>this.strings(e(t),e(n))},byKey(e){return this.by(t=>t[e])},byGet(e){return this.by(t=>t.get(e))}}}}])

//# sourceMappingURL=69-c-30e428118b.js.map