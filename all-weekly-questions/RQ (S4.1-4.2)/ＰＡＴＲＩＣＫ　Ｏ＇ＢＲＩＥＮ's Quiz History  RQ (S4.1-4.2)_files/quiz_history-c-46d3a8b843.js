(window["canvasWebpackJsonp"]=window["canvasWebpackJsonp"]||[]).push([[536],{B1vq:function(e,t,s){"use strict"
var n=s("ouhR")
var i=s.n(n)
s("s/PJ")
i.a.fn.scrollToVisible=function(e){const t={}
const s=i()(e)
if(0===s.length)return
let n=s.offset(),r=s.outerWidth(),a=s.outerHeight(),u=n.top,o=u+a,l=n.left,d=l+r,_="html,body"==this.selector?i.a.windowScrollTop():this.scrollTop(),c=this.scrollLeft(),h=this.outerHeight(),w=this.outerWidth()
if("html,body"!=this.selector){let e=i()("body").offset()
this.each((function(){try{e=i()(this).offset()
return false}catch(e){}}))
u-=e.top
o-=e.top
l-=e.left
d-=e.left}if("HTML"==this[0].tagName||"BODY"==this[0].tagName){h=i()(window).height()
i()("#wizard_box:visible").length>0&&(h-=i()("#wizard_box:visible").height())
w=i()(window).width()
u-=_
l-=c
o-=_
d-=c}u<0||h<a&&o>h?t.scrollTop=u+_:o>h&&(t.scrollTop=o+_-h+20)
l<0?t.scrollLeft=l+c:d>w&&(t.scrollLeft=d+c-w+20)
1==t.scrollTop&&(t.scrollTop=0)
1==t.scrollLeft&&(t.scrollLeft=0)
this.scrollTop(t.scrollTop)
this.scrollLeft(t.scrollLeft)
return this}},HbFp:function(e,t,s){"use strict"
var n=s("qJBq")
var i=s.n(n)
var r=s("pQTu")
const a={_parseNumber:i.a,parse(e){if(null==e)return NaN
if("number"===typeof e)return e
let t=a._parseNumber(e.toString(),{thousands:r["default"].lookup("number.format.delimiter"),decimal:r["default"].lookup("number.format.separator")})
isNaN(t)&&(t=a._parseNumber(e))
e.toString().match(/e/)&&isNaN(t)&&(t=parseFloat(e))
return t},validate:e=>!isNaN(a.parse(e))}
t["a"]=a},LqrG:function(e,t,s){"use strict"
s.d(t,"a",(function(){return u}))
var n=s("qx8k")
var i=s("ouhR")
var r=s.n(i)
var a=s("HIhM")
class u{constructor(){this.idGenerator=0
this.$questions=r()("#questions.show_correct_answers:not(.survey_quiz)")
this.rightAnswers=this.$questions.find(".selected_answer.correct_answer")
this.wrongAnswers=this.$questions.find(".selected_answer.wrong_answer")
this.correctAnswers=this.$questions.find(".question:not(.short_answer_question, .numerical_question, .matching_question) .correct_answer:not(.selected_answer)")
this.editableMatches=r()("#quiz_edit_wrapper").find(this.$questions.selector).find(".question.matching_question .correct_answer:not(.selected_answer)")
this.readOnlyMatches=r()("#quiz_show").find(this.$questions.selector).find(".question.matching_question .correct_answer:not(.selected_answer)")
this.shortAnswers=this.$questions.filter(":not(.survey_results)").find(".short_answer_question .answers_wrapper, #questions.show_correct_answers:not(.survey_results):not(.survey_quiz) .numerical_question .answers_wrapper, #questions.show_correct_answers:not(.survey_results):not(.survey_quiz) .equation_combinations_holder_holder.calculated_question_answers")
this.unansweredQ=r()(".question.unanswered .header .question_name")
this.creditPartial=r()("#questions.suppress_correct_answers:not(.survey_results) .question.partial_credit .header .question_name")
this.creditFull=r()("#questions.suppress_correct_answers:not(.survey_results) .question.correct .header .question_name")
this.creditNone=r()("#questions.suppress_correct_answers:not(.survey_results) .question.incorrect:not(.unanswered) .header .question_name")
this.surveyAnswers=r()("#questions.survey_results .selected_answer")
this.rightTpl=r()("<span />",{class:"answer_arrow correct"})
this.wrongTpl=r()("<span />",{class:"answer_arrow incorrect"})
this.correctTpl=r()("<span />",{class:"answer_arrow info"})
this.shortTpl=r()("<span />",{class:"answer_arrow info"})
this.unansweredTpl=r()("<span />",{class:"answer_arrow incorrect"})
this.creditFullTpl=r()("<span />",{class:"answer_arrow correct"})
this.creditPartialTpl=r()("<span />",{class:"answer_arrow incorrect"})
this.creditNoneTpl=r()("<span />",{class:"answer_arrow incorrect"})
this.surveyAnswerTpl=r()("<span />",{class:"answer_arrow info"})}applyCSS(){r.a.each([this.rightTpl,this.wrongTpl,this.correctTpl,this.shortTpl,this.surveyAnswerTpl],(function(){this.css({[Object(a["a"])("left")]:-128,top:5})}))
r.a.each([this.unansweredTpl,this.creditFullTpl,this.creditNoneTpl,this.creditPartialTpl],(function(){this.css({[Object(a["a"])("left")]:-108,top:9})}))}applyCorrectAndIncorrectArrows(){this.rightTpl.text(n["a"].t("answers.correct","Correct!"))
this.wrongTpl.text(n["a"].t("answers.you_answered","You Answered"))
this.correctTpl.text(n["a"].t("answers.right","Correct Answer"))
this.shortTpl.text(n["a"].t("answers.correct_answers","Correct Answers"))
this.creditFullTpl.text(n["a"].t("answers.correct","Correct!"))
this.creditPartialTpl.text(n["a"].t("answers.partial","Partial"))
this.creditNoneTpl.text(n["a"].t("answers.incorrect","Incorrect"))
this.rightAnswers.prepend(this.rightTpl)
this.wrongAnswers.prepend(this.wrongTpl)
this.correctAnswers.prepend(this.correctTpl)
this.editableMatches.parent().before(this.correctTpl.clone())
this.readOnlyMatches.prepend(this.correctTpl.clone())
this.shortAnswers.prepend(this.shortTpl)
this.creditPartial.prepend(this.creditPartialTpl)
this.creditFull.prepend(this.creditFullTpl)
this.creditNone.prepend(this.creditNoneTpl)}applyAnsweredAndUnansweredArrows(){this.unansweredTpl.text(n["a"].t("answers.unanswered","Unanswered"))
this.surveyAnswerTpl.text(n["a"].t("answers.you_answered","You Answered"))
this.unansweredQ.prepend(this.unansweredTpl)
this.surveyAnswers.prepend(this.surveyAnswerTpl)}makeArrowsAccessible(){r()(".short_answer_question .answer_arrow").css("top",5)
r()("#questions .answer_arrow").each((function(){const e=r()(this)
const t=e.parent()
let s=r()()
let n=t.prop("id")
n||(n=["user_answer",++this.idGenerator].join("_"))
n=[n,"arrow"].join("_")
e.prop("id",n)
s=t.find("input:visible")
s.length||(s=t)
s.attr("aria-describedby",n)}))}applyArrows(){this.applyCSS()
ENV.IS_SURVEY||this.applyCorrectAndIncorrectArrows()
this.applyAnsweredAndUnansweredArrows()
this.makeArrowsAccessible()}}},OShF:function(e,t,s){"use strict"
var n=s("ouhR")
var i=s.n(n)
var r=s("5Ky4")
s("JI1W")
i.a.fn.fillTemplateData=function(e){if(this.length&&e){e.iterator&&this.find("*").andSelf().each((function(){const t=i()(this)
i.a.each(["name","id","class"],(s,n)=>{t.attr(n)&&t.attr(n,t.attr(n).replace(/-iterator-/,e.iterator))})}))
e.id&&this.attr("id",e.id)
let n=false
if(e.data)for(var t in e.data){if(e.except&&-1!=i.a.inArray(t,e.except))continue
e.data[t]&&e.dataValues&&-1!=i.a.inArray(t,e.dataValues)&&this.data(t,e.data[t].toString())
const a=this.find("."+t)
var s=e.avoid||""
a.each((function(){const a=i()(this)
if(a.length>0&&0===a.closest(s).length){"undefined"!==typeof e.data[t]&&null!==e.data[t]||(e.data[t]="")
if(e.htmlValues&&-1!=i.a.inArray(t,e.htmlValues)){a.html(i.a.raw(e.data[t].toString()))
if(a.hasClass("user_content")){n=true
a.removeClass("enhanced")
a.data("unenhanced_content_html",e.data[t].toString())}}else if("INPUT"==a[0].tagName.toUpperCase())a.val(e.data[t])
else try{const s=e.data[t].toString()
a.html(Object(r["a"])(s))}catch(e){}}}))}e.hrefValues&&e.data&&this.find("a,span[rel]").each((function(){let t,s,n,r=i()(this)
for(const a in e.hrefValues){if(!e.hrefValues.hasOwnProperty(a))continue
const u=e.hrefValues[a]
if(t=r.attr("href")){const s=i.a.replaceTags(t,u,encodeURIComponent(e.data[u]))
const n=r.text()===r.html()?r.text():null
if(t!==s){r.attr("href",s)
n&&r.text(n)}}(s=r.attr("rel"))&&r.attr("rel",i.a.replaceTags(s,u,e.data[u]));(n=r.attr("name"))&&r.attr("name",i.a.replaceTags(n,u,e.data[u]))}}))
n&&i()(document).triggerHandler("user_content_change")}return this}
i.a.fn.fillTemplateData.defaults={htmlValues:null,hrefValues:null}
i.a.fn.getTemplateData=function(e){if(!this.length||!e)return{}
var t,s={}
if(e.textValues){const t=this
e.textValues.forEach(e=>{const r=t.find("."+e.replace(/\[/g,"\\[").replace(/\]/g,"\\]")+":first")
n=i.a.trim(r.text())
"&nbsp;"===r.html()&&(n="")
1===n.length&&160===n.charCodeAt(0)&&(n="")
s[e]=n})}if(e.dataValues)for(t in e.dataValues){var n=this.data(e.dataValues[t])
n&&(s[e.dataValues[t]]=n)}if(e.htmlValues)for(t in e.htmlValues){const r=this.find("."+e.htmlValues[t].replace(/\[/g,"\\[").replace(/\]/g,"\\]")+":first")
n=null
n=r.hasClass("user_content")&&r.data("unenhanced_content_html")?r.data("unenhanced_content_html"):i.a.trim(r.html())
s[e.htmlValues[t]]=n}return s}
i.a.fn.getTemplateValue=function(e,t){const s=i.a.extend({},t,{textValues:[e]})
return this.getTemplateData(s)[e]}},fO6K:function(e,t,s){"use strict"
s.r(t)
var n=s("ouhR")
var i=s.n(n)
var r=s("LqrG")
var a=s("lkPJ")
var u=s("pQTu")
var o=s("HbFp")
s("p6Wi")
s("OShF")
s("s/PJ")
s("vwFW")
var l={exists:()=>window.parent&&window.parent.INST,respondsTo:e=>l.exists()&&i.a.isFunction(window.parent.INST[e]),hasProperty:e=>l.exists()&&window.parent.INST[e],set(e,t){l.exists()&&(window.parent.INST[e]=t)},get(e){if(l.hasProperty(e))return window.parent.INST[e]}}
const d=i()("#submission_details").getTemplateData({textValues:["version_number","user_id"]})
var _={snapshot:{user_id:d.user_id||null,version_number:d.version_number,last_question_touched:null,question_updates:{},fudge_points:0},$quizBody:null,jumpPosition(e){const t=i()("#question_"+e)
return t.length>0?t.offset().top-110:0},checkQuizBody(){null===_.$quizBody&&(_.$quizBody=i()("html,body"))},jumpToQuestion(e){const t=_.jumpPosition(e)
_.checkQuizBody()
_.$quizBody.stop()
_.$quizBody.clearQueue()
_.$quizBody.animate({scrollTop:t},500)},jumpDirectlyToQuestion(e){const t=_.jumpPosition(e)
_.checkQuizBody()
_.$quizBody.scrollTop(t)},externallySet:false,setSnapshot(e,t){if(e){if(t&&_.externallySet)return
_.externallySet=true
_.snapshot=e
for(const t in e.question_updates){const s=e.question_updates[t]
const n=i()("#question_"+t)
ENV.GRADE_BY_QUESTION||n.addClass("modified_but_not_saved")
n.find("#question_input_hidden").val(s.points).end().find(".user_points :text").val(u["default"].n(s.points)).end().find(".question_neutral_comment .question_comment_text textarea").val(s.comments)}l.hasProperty("lastQuestionTouched")&&!ENV.GRADE_BY_QUESTION?_.jumpToQuestion(window.parent.INST.lastQuestionTouched):_.snapshot.last_question_touched&&!ENV.GRADE_BY_QUESTION&&_.jumpToQuestion(_.snapshot.last_question_touched)}else t&&l.hasProperty("lastQuestionTouched")&&!ENV.GRADE_BY_QUESTION&&_.jumpToQuestion(window.parent.INST.lastQuestionTouched);(_.externallySet||t)&&i()("#feel_free_to_toggle_message").show()
l.respondsTo("refreshQuizSubmissionSnapshot")&&window.parent.INST.refreshQuizSubmissionSnapshot(_.snapshot)},update(e,t){_.snapshot.question_updates[e]=t
_.snapshot.last_question_touched=e
_.setSnapshot()}}
const c={ensureSelectEventsFire(){i()("input[type=text]").focus((function(){i()(this).select()}))},scrollToUpdatedQuestion(e,t){if(0==t.indexOf("#question")){const e=t.substring(10)
_.jumpToQuestion(e)}},updateSnapshotFor(e){const t=e.attr("id").substring(9)||null
if(t){const s={}
ENV.GRADE_BY_QUESTION||e.addClass("modified_but_not_saved")
s.points=o["a"].parse(e.find(".user_points :text").val())
s.comments=e.find(".question_neutral_comment .question_comment_text textarea").val()||""
_.update(t,s)}i()(document).triggerHandler("score_changed")},addFudgePoints(e){if(e||0===e){_.snapshot.fudge_points=e
_.setSnapshot()}i()(document).triggerHandler("score_changed")},setInitialSnapshot(e){i()("#feel_free_to_toggle_message").show()
e?_.setSnapshot(e):_.setSnapshot(null,true)},onScoreChanged(){const e=i()("#after_fudge_points_total")
let t=0
i()(".display_question .user_points:visible").each((function(){let e=o["a"].parse(i()(this).find("input.question_input").val())||0
e=Math.round(100*e)/100
t+=e}))
let s=o["a"].parse(i()("#fudge_points_entry").val())||0
s=Math.round(100*s)/100
t+=s
e.text(u["default"].n(t)||"0")},questions:()=>i()(".question_holder").map((e,t)=>i()(t).position().top-320).toArray(),onScroll(){h.activateCorrectLink()
h.toggleDropShadow()},onWindowResize(){const e=i()(window).innerHeight()
const t=i()("div.question_holder:last-child").outerHeight()
const s=i()("#speed_update_scores_container").outerHeight()
const n=Math.max(e-t-150,s)
i()("#update_history_form .quiz-submission.headless").css("marginBottom",n+"px")}}
var h={index:0,windowSize:10,minWidth:66,startingLeftPos:32,navItemWidth:34,initialize(){i()(".user_points > .question_input").each((function(e){h.updateStatusFor(i()(this))}))
if(ENV.GRADE_BY_QUESTION){const e=parseInt(l.get("active_question_index"))
const t=i()(".q"+e).data("id")
isNaN(t)||_.jumpDirectlyToQuestion(t)}h.updateWindowSize()
h.setScrollWindowPosition(0)},size:()=>i()(".question-nav-link").length,tooBig:()=>h.size()>h.windowSize,updateWindowSize(){const e=i()(".quiz-nav, .quiz-nav-fullpage").width()
const t=10
const s=e-2*t
const n=Math.floor((s-h.minWidth)/h.navItemWidth)
h.windowSize=n
const r=n*h.navItemWidth+h.minWidth
i()(".quiz-nav .nav, .quiz-nav-fullpage .nav").animate({width:r+"px"},10)},navArrowCache:null,$navArrows(){null===h.navArrowCache&&(h.navArrowCache=i()(".quiz-nav .nav-arrow, .quiz-nav-fullpage .nav-arrow"))
return h.navArrowCache},navWrapperCache:null,$navWrapper(){null===h.navWrapperCache&&(h.navWrapperCache=i()("#quiz-nav-inner-wrapper"))
return h.navWrapperCache},updateArrows(){if(h.tooBig()){h.$navArrows().show()
h.$navWrapper().css({position:"absolute"})}else{h.$navArrows().hide()
h.$navWrapper().css({position:"relative"})}},toggleDropShadow(){i()(".quiz-nav").toggleClass("drshadow",i()(document).scrollTop()>0)},updateStatusFor(e){try{const t=e.attr("data-question-id")
const s=o["a"].parse(e.val())
i()("#quiz_nav_"+t).toggleClass("complete",!isNaN(s))}catch(e){}},activateLink(e){i()(".quiz-nav li").removeClass("active")
i()(".q"+e).addClass("active")},activateCorrectLink(){let e=1
const t=c.questions()
const s=i()(document).scrollTop()
const n=i()(".question")
for(let r=0;r<=t.length;r++){const a=i()(n[r])
const u=r+1
if(s>t[r]&&s<t[r+1]||r==t.length-1&&s>t[r]){e=u
l.set("active_question_index",u)
h.activateLink(u)
a.addClass("selected_single_question")}else{i()(".q"+u).removeClass("active")
a.removeClass("selected_single_question")}}h.setScrollWindowPosition(e)
return e},showQuestionsInWindow(e,t){const s=i()("#quiz-nav-inner-wrapper")
const n=h.startingLeftPos-e*h.navItemWidth
const r=n+"px"
const a=s.css("left")
if(r!==a){s.stop()
s.clearQueue()
s.animate({left:n+"px"},300)}},windowScrollLength:()=>Math.floor(h.windowSize/2),setScrollWindowPosition(e){isNaN(e)&&(e=0)
h.index=e
h.updateArrows()
if(h.tooBig()){let t=e-h.windowScrollLength()
const s=h.size()-h.windowSize
if(t<0){t=0
h.index=0}else if(t>s){t=s
h.index=s+h.windowScrollLength()}const n=t+h.windowSize-1
h.showQuestionsInWindow(t,n)}},previousQuestionBlock(){h.setScrollWindowPosition(h.index-h.windowSize)},nextQuestionBlock(){h.setScrollWindowPosition(h.index+h.windowSize)}}
i()(document).ready((function(){c.ensureSelectEventsFire()
if(ENV.GRADE_BY_QUESTION){i()(document).scroll(c.onScroll)
c.onWindowResize()
i()(".question_holder").click((function(){i()(".quiz-nav li").removeClass("active")
i()(".question").removeClass("selected_single_question")
const e=i()(".question")
const t=i()(this).find(".question")
const s=e.index(t)+1
l.set("active_question_index",s)
i()(".q"+s).addClass("active")
t.addClass("selected_single_question")}))}h.initialize()
i()(document).fragmentChange(c.scrollToUpdatedQuestion)
if(l.respondsTo("getQuizSubmissionSnapshot")){const e=window.parent.INST.getQuizSubmissionSnapshot(_.snapshot.user_id,_.snapshot.version_number)
c.setInitialSnapshot(e)}i()(".question_holder .user_points .question_input,.question_holder .question_neutral_comment .question_comment_text textarea").change((function(){const e=i()(this).parents(".display_question")
e.attr("id")
c.updateSnapshotFor(e)
if(i()(this).hasClass("question_input")){const t=o["a"].parse(i()(this).val())
const s=Number.isNaN(t)?"":t
e.find(".question_input_hidden").val(s)
h.updateStatusFor(i()(this))}}))
i()("#fudge_points_entry").change((function(){const e=o["a"].parse(i()(this).val())
const t=o["a"].parse(i()(this).val())
const s=Number.isNaN(t)?"":t
i()("#fudge_points_input").val(s)
c.addFudgePoints(e)}))
i()(document).bind("score_changed",c.onScoreChanged)
i()(".question-nav-link").click((function(e){e.preventDefault()
const t=i()(this).attr("data-id")
_.jumpToQuestion(t)}))
i()("#nav-prev").click(e=>{e.preventDefault()
h.previousQuestionBlock()})
i()("#nav-next").click(e=>{e.preventDefault()
h.nextQuestionBlock()})
i()(window).resize(()=>{h.updateWindowSize()
h.setScrollWindowPosition(h.index)
c.onWindowResize()})}))
ENV.SCORE_UPDATED&&i()(document).ready(()=>{l.respondsTo("refreshGrades")&&window.parent.INST.refreshGrades()
l.respondsTo("clearQuizSubmissionSnapshot")&&window.parent.INST.clearQuizSubmissionSnapshot(_.snapshot)})
i()(()=>{const e=new r["a"]
e.applyArrows()
a["a"].disableInputs("[type=radio], [type=checkbox]")
a["a"].setWidths()})},lkPJ:function(e,t,s){"use strict"
var n=s("ouhR")
var i=s.n(n)
const r={disableInputs(e){const t=i()("body"),s=i()("<div />",{class:"input_cover"})
s.on("mouseleave",(function(e){i()(this).remove()}))
i()(e).on("mouseenter",(function(e){const n=i()(this),r=s.clone(true)
r.css({height:n.height()+12,width:n.width()+12,position:"absolute",left:n.offset().left-6,top:n.offset().top-6,zIndex:15,background:"url(/images/blank.png) 0 0 repeat"})
t.append(r)}))},setWidths(e){i()(e||".answer input[type=text]").each((function(){i()(this).width(9.5*i()(this).val().length)}))}}
t["a"]=r},p6Wi:function(e,t,s){"use strict"
var n=s("pQTu")
var i=s("m0r6")
Object(i["a"])(JSON.parse('{"ar":{"buttons":{"cancel":"إلغاء","delete":"حذف"},"instructure_misc_plugins":{"confirms":{"default_delete_thing":"هل ترغب بالتأكيد في حذف هذا؟"}}},"cy":{"buttons":{"cancel":"Canslo","delete":"Dileu"},"instructure_misc_plugins":{"confirms":{"default_delete_thing":"Ydych chi’n siŵr eich bod am ddileu hyn?"}}},"da":{"buttons":{"cancel":"Annuller","delete":"Slet"},"instructure_misc_plugins":{"confirms":{"default_delete_thing":"Er du sikker på, at du vil slette dette?"}}},"da-x-k12":{"buttons":{"cancel":"Annuller","delete":"Slet"},"instructure_misc_plugins":{"confirms":{"default_delete_thing":"Er du sikker på, at du vil slette dette?"}}},"de":{"buttons":{"cancel":"Abbrechen","delete":"Löschen"},"instructure_misc_plugins":{"confirms":{"default_delete_thing":"Möchten Sie dies wirklich löschen?"}}},"el":{"buttons":{"cancel":"Ακύρωση","delete":"Διαγραφή"},"instructure_misc_plugins":{"confirms":{"default_delete_thing":"Είστε σίγουρος/η ότι επιθυμείτε να το διαγράψετε;"}}},"en-AU":{"buttons":{"cancel":"Cancel","delete":"Delete"},"instructure_misc_plugins":{"confirms":{"default_delete_thing":"Are you sure you want to delete this?"}}},"en-AU-x-unimelb":{"buttons":{"cancel":"Cancel","delete":"Delete"},"instructure_misc_plugins":{"confirms":{"default_delete_thing":"Are you sure you want to delete this?"}}},"en-CA":{"buttons":{"cancel":"Cancel","delete":"Delete"},"instructure_misc_plugins":{"confirms":{"default_delete_thing":"Are you sure you want to delete this?"}}},"en-GB":{"buttons":{"cancel":"Cancel","delete":"Delete"},"instructure_misc_plugins":{"confirms":{"default_delete_thing":"Are you sure you want to delete this?"}}},"en-GB-x-lbs":{"buttons":{"cancel":"Cancel","delete":"Delete"}},"en-GB-x-ukhe":{"buttons":{"cancel":"Cancel","delete":"Delete"},"instructure_misc_plugins":{"confirms":{"default_delete_thing":"Are you sure you want to delete this?"}}},"es":{"buttons":{"cancel":"Cancelar","delete":"Eliminar"},"instructure_misc_plugins":{"confirms":{"default_delete_thing":"¿Seguro que desea eliminarlo?"}}},"fa":{"buttons":{"cancel":"لغو","delete":"حذف"},"instructure_misc_plugins":{"confirms":{"default_delete_thing":"مطمئنید که می خواهید این مورد حذف شود؟"}}},"fi":{"buttons":{"cancel":"Peruuta","delete":"Poista"},"instructure_misc_plugins":{"confirms":{"default_delete_thing":"Haluatko varmasti poistaa tämän?"}}},"fr":{"buttons":{"cancel":"Annuler","delete":"Supprimer"},"instructure_misc_plugins":{"confirms":{"default_delete_thing":"Voulez-vous vraiment supprimer cet élément ?"}}},"fr-CA":{"buttons":{"cancel":"Annuler","delete":"Supprimer"},"instructure_misc_plugins":{"confirms":{"default_delete_thing":"Voulez-vous vraiment supprimer cet élément?"}}},"he":{"buttons":{"cancel":"ביטול","delete":"ביטול"},"instructure_misc_plugins":{"confirms":{"default_delete_thing":"בטוח/ה שרוצה לבטל זאת?"}}},"ht":{"buttons":{"cancel":"Anile","delete":"Efase"},"instructure_misc_plugins":{"confirms":{"default_delete_thing":"Ou kwè vrèman ou vle efase sa a?"}}},"hu":{"buttons":{"cancel":"Mégse","delete":"Törlés"},"instructure_misc_plugins":{"confirms":{"default_delete_thing":"Biztos benne, hogy törli ezt?"}}},"hy":{"buttons":{"cancel":"Չեղյալ համարել","delete":"Ջնջել"},"instructure_misc_plugins":{"confirms":{"default_delete_thing":"Դուք իսկապե՞ս ցանկանում եք ջնջել սա:"}}},"is":{"buttons":{"cancel":"Hætta við","delete":"Eyða"},"instructure_misc_plugins":{"confirms":{"default_delete_thing":"Viltu örugglega eyða þessu?"}}},"it":{"buttons":{"cancel":"Annulla","delete":"Elimina"},"instructure_misc_plugins":{"confirms":{"default_delete_thing":"Vuoi eliminare questo?"}}},"ja":{"buttons":{"cancel":"キャンセル","delete":"削除"},"instructure_misc_plugins":{"confirms":{"default_delete_thing":"これを削除してもよろしいですか?"}}},"ko":{"buttons":{"cancel":"취소","delete":"삭제"},"instructure_misc_plugins":{"confirms":{"default_delete_thing":"삭제하시겠습니까?"}}},"mi":{"buttons":{"cancel":"Whakakore","delete":"Muku"},"instructure_misc_plugins":{"confirms":{"default_delete_thing":"E tino hiahia ana koe ki te muku i tēnei?"}}},"nb":{"buttons":{"cancel":"Avbryt","delete":"Slett"},"instructure_misc_plugins":{"confirms":{"default_delete_thing":"Er du sikker på at du ønsker å slette dette?"}}},"nb-x-k12":{"buttons":{"cancel":"Avbryt","delete":"Slett"},"instructure_misc_plugins":{"confirms":{"default_delete_thing":"Er du sikker på at du ønsker å slette dette?"}}},"nl":{"buttons":{"cancel":"Annuleren","delete":"Verwijderen"},"instructure_misc_plugins":{"confirms":{"default_delete_thing":"Weet je zeker dat je dit wilt verwijderen?"}}},"nn":{"buttons":{"cancel":"Avbryt","delete":"Slett"},"instructure_misc_plugins":{"confirms":{"default_delete_thing":"Er du sikker på at du vil slette dette?"}}},"pl":{"buttons":{"cancel":"Anuluj","delete":"Usuń"},"instructure_misc_plugins":{"confirms":{"default_delete_thing":"Czy na pewno chcesz usunąć ten element?"}}},"pt":{"buttons":{"cancel":"Cancelar","delete":"Excluir"},"instructure_misc_plugins":{"confirms":{"default_delete_thing":"Tem certeza de que deseja excluir isto?"}}},"pt-BR":{"buttons":{"cancel":"Cancelar","delete":"Excluir"},"instructure_misc_plugins":{"confirms":{"default_delete_thing":"Tem certeza que deseja excluir isto?"}}},"ru":{"buttons":{"cancel":"Отменить","delete":"Удалить"},"instructure_misc_plugins":{"confirms":{"default_delete_thing":"Действительно хотите удалить?"}}},"sl":{"buttons":{"cancel":"Prekliči","delete":"Odstrani"}},"sv":{"buttons":{"cancel":"Avbryt","delete":"Radera"},"instructure_misc_plugins":{"confirms":{"default_delete_thing":"Är du säker på att du vill radera det här?"}}},"sv-x-k12":{"buttons":{"cancel":"Avbryt","delete":"Radera"}},"tr":{"buttons":{"cancel":"İptal","delete":"Sil"},"instructure_misc_plugins":{"confirms":{"default_delete_thing":"Bunu silmek istediğinize emin misiniz?"}}},"uk":{"buttons":{"cancel":"Скасувати","delete":"Видалити"}},"zh-Hans":{"buttons":{"cancel":"取消","delete":"删除"},"instructure_misc_plugins":{"confirms":{"default_delete_thing":"是否确定要删除它?"}}},"zh-Hant":{"buttons":{"cancel":"取消","delete":"刪除"},"instructure_misc_plugins":{"confirms":{"default_delete_thing":"您是否確定要刪除？"}}}}'))
s("jQeR")
s("0sPK")
var r=n["default"].scoped("instructure_misc_plugins")
var a=s("ouhR")
var u=s.n(a)
var o=s("5Ky4")
var l=s("JD5e")
s("jYyc")
s("YGE8")
s("B1vq")
s("s/PJ")
u.a.fn.setOptions=function(e,t){let s=e?"<option value=''>"+Object(o["a"])(e)+"</option>":""
null==t&&(t=[])
t.forEach(e=>{const t=Object(o["a"])(e)
s+='<option value="'+t+'">'+t+"</option>"})
return this.html(u.a.raw(s))}
u.a.fn.ifExists=function(e){this.length&&e.call(this,this)
return this}
u.a.fn.scrollbarWidth=function(){const e=u()('<div style="width:50px;height:50px;overflow:hidden;position:absolute;top:-200px;left:-200px;"><div style="height:100px;"></div>').appendTo(this),t=e.find("div")
const s=t.innerWidth()
e.css("overflow-y","scroll")
const n=t.innerWidth()
e.remove()
return s-n}
u.a.fn.dim=function(e){return this.animate({opacity:.4},e)}
u.a.fn.undim=function(e){return this.animate({opacity:1},e)}
u.a.fn.confirmDelete=function(e){e=u.a.extend({},u.a.fn.confirmDelete.defaults,e)
const t=this
let s=null
let n=true
e.noMessage=e.noMessage||e.no_message
const i=function(){if(!n){e.cancelled&&u.a.isFunction(e.cancelled)&&e.cancelled.call(t)
return}e.confirmed||(e.confirmed=function(){t.dim()})
e.confirmed.call(t)
if(e.url){e.success||(e.success=function(e){t.fadeOut("slow",()=>{t.remove()})})
const n=e.prepareData?e.prepareData.call(t,s):{}
n.authenticity_token=Object(l["a"])()
u.a.ajaxJSON(e.url,"DELETE",n,s=>{e.success.call(t,s)},(s,n,i,r)=>{e.error&&u.a.isFunction(e.error)?e.error.call(t,s,n,i,r):u.a.ajaxJSON.unhandledXHRs.push(n)})}else{e.success||(e.success=function(){t.fadeOut("slow",()=>{t.remove()})})
e.success.call(t)}}
if(e.message&&!e.noMessage&&!u.a.skipConfirmations){if(e.dialog){n=false
const t="object"===typeof e.dialog?e.dialog:{}
s=u()(e.message).dialog(u.a.extend({},{modal:true,close:i,buttons:[{text:r.t("#buttons.cancel","Cancel"),click(){u()(this).dialog("close")}},{text:r.t("#buttons.delete","Delete"),class:"btn-primary",click(){n=true
u()(this).dialog("close")}}]},t))
return}n=confirm(e.message)}i()}
u.a.fn.confirmDelete.defaults={get message(){return r.t("confirms.default_delete_thing","Are you sure you want to delete this?")}}
u.a.fn.fragmentChange=function(e){if(e&&true!==e){const s=(window.location.search||"").replace(/^\?/,"").split("&")
let n=null
for(var t=0;t<s.length;t++){const e=s[t]
e&&0===e.indexOf("hash=")&&(n="#"+e.substring(5))}this.bind("document_fragment_change",e)
const i=this
let r=false
for(t=0;t<u.a._checkFragments.fragmentList.length;t++){const e=u.a._checkFragments.fragmentList[t]
e.doc[0]==i[0]&&(r=true)}r||u.a._checkFragments.fragmentList.push({doc:i,fragment:""})
u()(window).bind("hashchange",u.a._checkFragments)
setTimeout(()=>{n&&n.length>0?i.triggerHandler("document_fragment_change",n):i&&i[0]&&i[0].location&&i[0].location.hash.length>0&&i.triggerHandler("document_fragment_change",i[0].location.hash)},500)}else this.triggerHandler("document_fragment_change",this[0].location.hash)
return this}
u.a._checkFragments=function(){const e=u.a._checkFragments.fragmentList
for(let t=0;t<e.length;t++){const s=e[t]
const n=s.doc
if(n[0].location.hash!=s.fragment){n.triggerHandler("document_fragment_change",n[0].location.hash)
s.fragment=n[0].location.hash
u.a._checkFragments.fragmentList[t]=s}}}
u.a._checkFragments.fragmentList=[]
u.a.fn.clickLink=function(){const e=this.eq(0)
e.hasClass("disabled_link")||e.click()}
u.a.fn.showIf=function(e){if(u.a.isFunction(e))return this.each((function(t){u()(this).showIf(e.call(this))}))
e?this.show():this.hide()
return this}
u.a.fn.disableIf=function(e){u.a.isFunction(e)&&(e=e.call(this))
this.prop("disabled",!!e)
return this}
u.a.fn.indicate=function(e){e=e||{}
let t
if("remove"==e){t=this.data("indicator")
t&&t.remove()
return}u()(".indicator_box").remove()
let s=this.offset()
e&&e.offset&&(s=e.offset)
const n=this.width()
const i=this.height()
const r=(e.container||this).zIndex()
t=u()(document.createElement("div"))
t.css({width:n+6,height:i+6,top:s.top-3,left:s.left-3,zIndex:r+1,position:"absolute",display:"block","-moz-border-radius":5,opacity:.8,border:"2px solid #870",backgroundColor:"#fd0"})
t.addClass("indicator_box")
t.mouseover((function(){u()(this).stop().fadeOut("fast",(function(){u()(this).remove()}))}))
this.data("indicator")&&this.indicate("remove")
this.data("indicator",t)
u()("body").append(t)
e&&e.singleFlash?t.hide().fadeIn().animate({opacity:.8},500).fadeOut("slow",(function(){u()(this).remove()})):t.hide().fadeIn().animate({opacity:.8},500).fadeOut("slow").fadeIn("slow").animate({opacity:.8},2500).fadeOut("slow",(function(){u()(this).remove()}))
e&&e.scroll&&u()("html,body").scrollToVisible(t)}
u.a.fn.hasScrollbar=function(){return this.length&&this[0].clientHeight<this[0].scrollHeight}
u.a.fn.log=function(e){console.log("%s: %o",e,this)
return this}
u.a.fn.fillWindowWithMe=function(e){const t=u.a.extend({minHeight:400},e),s=u()(this),n=u()("#wrapper"),i=u()("#main"),r=u()("#not_right_side"),a=u()(window),o=u()(this).add(t.alsoResize)
function l(){o.height(0)
const e=a.height()-(n.offset().top+n.outerHeight())+(i.height()-r.height()),l=Math.max(400,e)
o.height(l)
u.a.isFunction(t.onResize)&&t.onResize.call(s,l)}l()
a.unbind("resize.fillWindowWithMe").bind("resize.fillWindowWithMe",l)
return this}
u.a.fn.autoGrowInput=function(e){e=u.a.extend({maxWidth:1e3,minWidth:0,comfortZone:70},e)
this.filter("input:text").each((function(){let t=e.minWidth||u()(this).width(),s="",n=u()(this),i=u()("<tester/>").css({position:"absolute",top:-9999,left:-9999,width:"auto",fontSize:n.css("fontSize"),fontFamily:n.css("fontFamily"),fontWeight:n.css("fontWeight"),letterSpacing:n.css("letterSpacing"),whiteSpace:"nowrap"}),r=function(){setTimeout(()=>{if(s===(s=n.val()))return
i.text(s)
const r=i.width(),a=r+e.comfortZone>=t?r+e.comfortZone:t,u=n.width(),o=a<u&&a>=t||a>t&&a<e.maxWidth
o&&n.width(a)})}
i.insertAfter(n)
u()(this).bind("keyup keydown blur update change",r)}))
return this}
u.a},qJBq:function(e,t){(function(){var t,s,n
n=[]
t={}
e.exports=s=function(e,s,i){var r,a,u,o,l,d,_,c,h
null==i&&(i=true)
if("string"===typeof s){if(2!==s.length)throw{name:"ArgumentException",message:"The format for string options is '<thousands><decimal>' (exactly two characters)"}
h=s[0],r=s[1]}else if(Array.isArray(s)){if(2!==s.length)throw{name:"ArgumentException",message:"The format for array options is ['<thousands>','[<decimal>'] (exactly two elements)"}
h=s[0],r=s[1]}else{h=(null!=s?s.thousands:void 0)||(null!=s?s.group:void 0)||t.thousands
r=(null!=s?s.decimal:void 0)||t.decimal}_=""+h+r+i
d=n[_]
if(null==d){u=i?3:1
d=n[_]=new RegExp("^\\s*([+-]?(?:(?:\\d{1,3}(?:\\"+h+"\\d{"+u+",3})+)|\\d*))(?:\\"+r+"(\\d*))?\\s*$")}c=e.match(d)
if(!(null!=c&&3===c.length))return NaN
o=c[1].replace(new RegExp("\\"+h,"g"),"")
a=c[2]
l=parseFloat(o+"."+a)
return l}
e.exports.setOptions=function(e){var s,n
for(s in e){n=e[s]
t[s]=n}}
e.exports.factoryReset=function(){t={thousands:",",decimal:"."}}
e.exports.withOptions=function(e,t){null==t&&(t=true)
return function(n){return s(n,e,t)}}
e.exports.factoryReset()}).call(this)},qx8k:function(e,t,s){"use strict"
var n=s("pQTu")
var i=s("m0r6")
Object(i["a"])(JSON.parse('{"ar":{"quizzes":{"show":{"answers":{"correct":"صحيح!","correct_answers":"الإجابات الصحيحة!","incorrect":"غير صحيح","partial":"جزئي","right":"الإجابة الصحيحة","unanswered":"غير مجاب عليه","you_answered":"أنت أجبت"},"buttons":{"already_published":"تم النشر!","publishing":"جارٍ النشر..."},"confirms":{"delete_quiz":"هل ترغب بالتأكيد في حذف هذا الاختبار؟","delete_quiz_submissions_warning":{"one":"تحذير: لقد خضع طالب واحد بالفعل لهذا الاختبار، وإذا قمت بحذفه فسيتم حذف أي عمليات إرسال مكتملة ولن تظهر بعد الآن في دفتر التقييم","other":"تحذير: لقد خضع %{count} من الطلاب بالفعل لهذا الاختبار، وإذا قمت بحذفه فسيتم حذف أي عمليات إرسال مكتملة ولن تظهر بعد الآن في دفتر التقييم"}},"links":{"hide_student_quiz_results":"إخفاء نتائج اختبار الطالب","hide_student_survey_results":"إخفاء نتائج استطلاع الطالب","show_student_quiz_results":"إظهار نتائج اختبار الطالب","show_student_survey_results":"إظهار نتائج استطلاع الطالب"},"students_who_have_not_taken_the_quiz":"الطلاب الذين لم يجيبوا على الاختبار","students_who_have_taken_the_quiz":"الطلاب الذين أجابوا على الاختبار"}}},"cy":{"quizzes":{"show":{"answers":{"correct":"Cywir!","correct_answers":"Atebion Cywir","incorrect":"Anghywir","partial":"Rhannol","right":"Ateb Cywir","unanswered":"Heb ei ateb","you_answered":"Gwnaethoch chi ateb"},"buttons":{"already_published":"Wedi cyhoeddi!","publishing":"Wrthi’n cyhoeddi..."},"confirms":{"delete_quiz":"Ydych chi’n siŵr eich bod am ddileu’r cwis hwn?","delete_quiz_submissions_warning":{"one":"Rhybudd: Mae 1 myfyriwr wedi gwneud y cwis hwn yn barod. Os byddwch chi’n ei ddileu, caiff unrhyw gyflwyniadau sydd wedi’u cwblhau eu dileu, ac ni fyddant yn ymddangos yn y llyfr graddau mwyach.","other":"Rhybudd: %{count} myfyriwr wedi gwneud y cwis hwn yn barod. Os byddwch chi’n ei ddileu, caiff unrhyw gyflwyniadau sydd wedi’u cwblhau eu dileu, ac ni fyddant yn ymddangos yn y llyfr graddau mwyach."}},"links":{"hide_student_quiz_results":"Cuddio canlyniadau cwis myfyrwyr","hide_student_survey_results":"Cuddio canlyniadau arolwg myfyrwyr","show_student_quiz_results":"Dangos canlyniadau cwis myfyrwyr","show_student_survey_results":"Dangos canlyniadau arolwg myfyrwyr"},"students_who_have_not_taken_the_quiz":"Myfyrwyr sydd HEB wneud y cwis","students_who_have_taken_the_quiz":"Myfyrwyr sydd wedi gwneud y cwis"}}},"da":{"quizzes":{"show":{"answers":{"correct":"Korrekt!","correct_answers":"Korrekte svar","incorrect":"Forkert","partial":"Delvis","right":"Korrekt svar","unanswered":"Ikke besvaret","you_answered":"Du svarede"},"buttons":{"already_published":"Offentliggjort!","publishing":"Offentliggør ..."},"confirms":{"delete_quiz":"Er du sikker på, at du vil slette denne test?","delete_quiz_submissions_warning":{"one":"Advarsel: 1 studerende har allerede taget denne test. Hvis du sletter den, slettes alle afsluttede afleveringer og vises ikke længere i karakteroversigten.","other":"Advarsel: %{count} studerende har allerede taget denne test. Hvis du sletter den, slettes alle afsluttede afleveringer og vises ikke længere i karakteroversigten."}},"links":{"hide_student_quiz_results":"Skjul studerendes testresultater","hide_student_survey_results":"Skjul studerendes spørgeundersøgelsesresultater","show_student_quiz_results":"Vis studietestens resultater","show_student_survey_results":"Vis studieundersøgelsens resultater"},"students_who_have_not_taken_the_quiz":"Studerende som IKKE har taget testen","students_who_have_taken_the_quiz":"Studerende som har taget testen"}}},"da-x-k12":{"quizzes":{"show":{"answers":{"correct":"Korrekt!","correct_answers":"Korrekte svar","incorrect":"Forkert","partial":"Delvis","right":"Korrekt svar","unanswered":"Ikke besvaret","you_answered":"Du svarede"},"buttons":{"already_published":"Offentliggjort!","publishing":"Offentliggør ..."},"confirms":{"delete_quiz":"Er du sikker på, at du vil slette denne quiz?","delete_quiz_submissions_warning":{"one":"Advarsel: 1 elev har allerede taget denne quiz. Hvis du sletter den, slettes alle afsluttede afleveringer og vises ikke længere i vurderingsoversigten.","other":"Advarsel: %{count} elever har allerede taget denne quiz. Hvis du sletter den, slettes alle afsluttede afleveringer og vises ikke længere i vurderingsoversigten."}},"links":{"hide_student_quiz_results":"Skjul elevernes quizresultater","hide_student_survey_results":"Skjul elevernes spørgeundersøgelsesresultater","show_student_quiz_results":"Vis studiequizzens resultater","show_student_survey_results":"Vis studieundersøgelsens resultater"},"students_who_have_not_taken_the_quiz":"Elever, som IKKE har taget quizzen","students_who_have_taken_the_quiz":"Elever, som har taget quizzen"}}},"de":{"quizzes":{"show":{"answers":{"correct":"Richtig!","correct_answers":"Richtige Antworten","incorrect":"Falsch","partial":"Teilweise","right":"Richtige Antwort","unanswered":"Unbeantwortet","you_answered":"Sie antworteten"},"buttons":{"already_published":"Veröffentlicht!","publishing":"Wird veröffentlicht ..."},"confirms":{"delete_quiz":"Möchten Sie dieses Quiz wirklich löschen?","delete_quiz_submissions_warning":{"one":"Warnung: 1 Student hat an diesem Quiz bereits teilgenommen. Wenn Sie dieses Quiz löschen, werden alle Abgaben ebenfalls gelöscht und nicht länger im Notenbuch angezeigt.","other":"Warnung: %{count} Studenten haben an diesem Quiz bereits teilgenommen. Wenn Sie dieses Quiz löschen, werden alle Abgaben ebenfalls gelöscht und nicht länger im Notenbuch angezeigt."}},"links":{"hide_student_quiz_results":"Quiz-Ergebnisse des Studenten ausblenden","hide_student_survey_results":"Befragungsergebnisse des Studenten ausblenden","show_student_quiz_results":"Quizergebnisse des Studenten anzeigen","show_student_survey_results":"Befragungsergebnisse des Student anzeigen"},"students_who_have_not_taken_the_quiz":"Studenten, die das Quiz NICHT absolviert haben","students_who_have_taken_the_quiz":"Studenten, die das Quiz absolviert haben"}}},"el":{"quizzes":{"show":{"answers":{"correct":"Σωστά!","correct_answers":"Σωστές Απαντήσεις","incorrect":"Λάθος","partial":"Μερικός","right":"Σωστή Απάντηση","unanswered":"Δεν έχουν απαντηθεί","you_answered":"Απαντήσατε"},"buttons":{"already_published":"Δημοσιεύθηκε!","publishing":"Η δημοσίευση βρίσκεται σε εξέλιξη..."},"confirms":{"delete_quiz":"Είσαστε σίγουροι πως θέλετε να αφαιρέσετε αυτό το quiz;","delete_quiz_submissions_warning":{"one":"\\u003cmrk mid=\\"8105\\" mtype=\\"seg\\"\\u003eΠροειδοποίηση:\\u003c/mrk\\u003e \\u003cmrk mid=\\"8106\\" mtype=\\"seg\\"\\u003e1 σπουδαστής έχει ήδη συμπληρώσει αυτό το κουίζ.\\u003c/mrk\\u003e \\u003cmrk mid=\\"8107\\" mtype=\\"seg\\"\\u003eΑν το διαγράψετε, τυχόν ολοκληρωμένες υποβολές θα διαγραφούν και δεν θα εμφανίζονται πια στο βιβλίο βαθμών.\\u003c/mrk\\u003e","other":"\\u003cmrk mid=\\"8108\\" mtype=\\"seg\\"\\u003eΠροειδοποίηση:\\u003c/mrk\\u003e \\u003cmrk mid=\\"8109\\" mtype=\\"seg\\"\\u003e%{count} σπουδαστές έχουν ήδη συμπληρώσει αυτό το κουίζ.\\u003c/mrk\\u003e \\u003cmrk mid=\\"8110\\" mtype=\\"seg\\"\\u003eΑν το διαγράψετε, τυχόν ολοκληρωμένες υποβολές θα διαγραφούν και δεν θα εμφανίζονται πια στο βιβλίο βαθμών.\\u003c/mrk\\u003e"}},"links":{"hide_student_quiz_results":"Απόκρυψη Αποτελεσμάτων Κουίζ Σπουδαστή","hide_student_survey_results":"Απόκρυψη Αποτελεσμάτων Δημοσκόπησης Σπουδαστή","show_student_quiz_results":"Εμφάνιση Αποτελεσμάτων Κουίζ Σπουδαστή","show_student_survey_results":"Εμφάνιση Αποτελεσμάτων Δημοσκόπησης Σπουδαστή"},"students_who_have_not_taken_the_quiz":"Μαθητές που ΔΕΝ έχουν κάνει το κουίζ","students_who_have_taken_the_quiz":"Οι φοιτητές/ες που έχουν λάβει μέρος στο quiz"}}},"en-AU":{"quizzes":{"show":{"answers":{"correct":"Correct!","correct_answers":"Correct Answers","incorrect":"Incorrect","partial":"Partial","right":"Correct Answer","unanswered":"Unanswered","you_answered":"You Answered"},"buttons":{"already_published":"Published!","publishing":"Publishing..."},"confirms":{"delete_quiz":"Are you sure you want to delete this quiz?","delete_quiz_submissions_warning":{"one":"Warning: 1 student has already taken this quiz. If you delete it, any completed submissions will be deleted and no longer appear in the gradebook.","other":"Warning: %{count} students have already taken this quiz. If you delete it, any completed submissions will be deleted and no longer appear in the gradebook."}},"links":{"hide_student_quiz_results":"Hide Student Quiz Results","hide_student_survey_results":"Hide Student Survey Results","show_student_quiz_results":"Show Student Quiz Results","show_student_survey_results":"Show Student Survey Results"},"students_who_have_not_taken_the_quiz":"Students who have NOT taken the quiz","students_who_have_taken_the_quiz":"Students who have taken the quiz"}}},"en-AU-x-unimelb":{"quizzes":{"show":{"answers":{"correct":"Correct!","correct_answers":"Correct Answers","incorrect":"Incorrect","partial":"Partial","right":"Correct Answer","unanswered":"Unanswered","you_answered":"You Answered"},"buttons":{"already_published":"Published!","publishing":"Publishing..."},"confirms":{"delete_quiz":"Are you sure you want to delete this quiz?","delete_quiz_submissions_warning":{"one":"Warning: 1 student has already taken this quiz. If you delete it, any completed submissions will be deleted and no longer appear in the gradebook.","other":"Warning: %{count} students have already taken this quiz. If you delete it, any completed submissions will be deleted and no longer appear in the gradebook."}},"links":{"hide_student_quiz_results":"Hide Student Quiz Results","hide_student_survey_results":"Hide Student Survey Results","show_student_quiz_results":"Show Student Quiz Results","show_student_survey_results":"Show Student Survey Results"},"students_who_have_not_taken_the_quiz":"Students who have NOT taken the quiz","students_who_have_taken_the_quiz":"Students who have taken the quiz"}}},"en-CA":{"quizzes":{"show":{"answers":{"correct":"Correct!","correct_answers":"Correct Answers","incorrect":"Incorrect","partial":"Partial","right":"Correct Answer","unanswered":"Unanswered","you_answered":"You Answered"},"buttons":{"already_published":"Published!","publishing":"Publishing..."},"confirms":{"delete_quiz":"Are you sure you want to delete this quiz?","delete_quiz_submissions_warning":{"one":"Warning: 1 student has already taken this quiz. If you delete it, any completed submissions will be deleted and no longer appear in the gradebook.","other":"Warning: %{count} students have already taken this quiz. If you delete it, any completed submissions will be deleted and no longer appear in the gradebook."}},"links":{"hide_student_quiz_results":"Hide Student Quiz Results","hide_student_survey_results":"Hide Student Survey Results","show_student_quiz_results":"Show Student Quiz Results","show_student_survey_results":"Show Student Survey Results"},"students_who_have_not_taken_the_quiz":"Students who have NOT taken the quiz","students_who_have_taken_the_quiz":"Students who have taken the quiz"}}},"en-GB":{"quizzes":{"show":{"answers":{"correct":"Correct!","correct_answers":"Correct Answers","incorrect":"Incorrect","partial":"Partial","right":"Correct answer","unanswered":"Unanswered","you_answered":"You Answered"},"buttons":{"already_published":"Published!","publishing":"Publishing..."},"confirms":{"delete_quiz":"Are you sure you want to delete this quiz?","delete_quiz_submissions_warning":{"one":"Warning: 1 student has already taken this quiz. If you delete it, any completed submissions will be deleted and no longer appear in the gradebook.","other":"Warning: %{count} students have already taken this quiz. If you delete it, any completed submissions will be deleted and no longer appear in the gradebook."}},"links":{"hide_student_quiz_results":"Hide Student Quiz Results","hide_student_survey_results":"Hide Student Survey Results","show_student_quiz_results":"Show student quiz results","show_student_survey_results":"Show student survey results"},"students_who_have_not_taken_the_quiz":"Students who have NOT taken the quiz","students_who_have_taken_the_quiz":"Students who have taken the quiz"}}},"en-GB-x-lbs":{"quizzes":{"show":{"answers":{"correct":"Correct!","correct_answers":"Correct Answers","incorrect":"Incorrect","partial":"Partial","right":"Correct answer","unanswered":"Unanswered","you_answered":"You Answered"},"buttons":{"already_published":"Published!","publishing":"Publishing..."},"confirms":{"delete_quiz":"Are you sure you want to delete this survey?","delete_quiz_submissions_warning":{"one":"Warning: 1 student has already taken this survey. If you delete it, any completed submissions will be deleted and no longer appear in the gradebook.","other":"Warning: %{count} students have already taken this survey. If you delete it, any completed submissions will be deleted and no longer appear in the gradebook."}},"links":{"hide_student_quiz_results":"Hide Student Survey Results","hide_student_survey_results":"Hide Student Poll Results","show_student_quiz_results":"Show student survey results","show_student_survey_results":"Show student poll results"},"students_who_have_not_taken_the_quiz":"Students who have NOT taken the survey","students_who_have_taken_the_quiz":"Students who have taken the survey"}}},"en-GB-x-ukhe":{"quizzes":{"show":{"answers":{"correct":"Correct!","correct_answers":"Correct Answers","incorrect":"Incorrect","partial":"Partial","right":"Correct answer","unanswered":"Unanswered","you_answered":"You Answered"},"buttons":{"already_published":"Published!","publishing":"Publishing..."},"confirms":{"delete_quiz":"Are you sure you want to delete this quiz?","delete_quiz_submissions_warning":{"one":"Warning: 1 student has already taken this quiz. If you delete it, any completed submissions will be deleted and no longer appear in the gradebook.","other":"Warning: %{count} students have already taken this quiz. If you delete it, any completed submissions will be deleted and no longer appear in the gradebook."}},"links":{"hide_student_quiz_results":"Hide Student Quiz Results","hide_student_survey_results":"Hide Student Survey Results","show_student_quiz_results":"Show student quiz results","show_student_survey_results":"Show student survey results"},"students_who_have_not_taken_the_quiz":"Students who have NOT taken the quiz","students_who_have_taken_the_quiz":"Students who have taken the quiz"}}},"es":{"quizzes":{"show":{"answers":{"correct":"¡Correcto!","correct_answers":"Respuestas correctas","incorrect":"Incorrecto","partial":"Parcial","right":"Respuesta correcta","unanswered":"Sin responder","you_answered":"Respondido"},"buttons":{"already_published":"¡Publicado!","publishing":"Publicando..."},"confirms":{"delete_quiz":"¿Está seguro de que desea eliminar este examen?","delete_quiz_submissions_warning":{"one":"Advertencia: 1 estudiante ya ha tomado este examen. Si lo elimina, cualquier entrega completa será eliminada y no aparecerá en su libro de calificaciones.","other":"Advertencia: %{count} estudiantes ya han tomado este examen. Si lo elimina, cualquier entrega completa será eliminada y no aparecerá en su libro de calificaciones."}},"links":{"hide_student_quiz_results":"Ocultar los resultados de los exámenes de los estudiantes","hide_student_survey_results":"Ocultar los resultados de la encuesta de los estudiantes","show_student_quiz_results":"Mostrar los resultados de los exámenes de los estudiantes","show_student_survey_results":"Mostrar los resultados de la encuesta de los estudiantes"},"students_who_have_not_taken_the_quiz":"Estudiantes que NO han realizado el examen","students_who_have_taken_the_quiz":"Estudiantes que han realizado el examen"}}},"fa":{"quizzes":{"show":{"answers":{"correct":"درست است!","correct_answers":"پاسخ های درست","incorrect":"نادرست","partial":"جزئی","right":"پاسخ درست","unanswered":"پاسخ داده نشده","you_answered":"پاسخ دادید"},"buttons":{"already_published":"منتشر شد!","publishing":"درحال انتشار..."},"confirms":{"delete_quiz":"مطمئنید که می خواهید این آزمون حذف شود؟","delete_quiz_submissions_warning":{"one":"هشدار: %{count} دانشجو قبلا این آزمون را داده اند. اگر آن را حذف کنید، هر گونه مورد ارسالی تکمیل شده حذف می شود و دیگر در دفتر نمره ظاهر نمی شود.","other":"هشدار: %{count} دانشجو قبلا این آزمون را داده اند. اگر آن را حذف کنید، هر گونه مورد ارسالی تکمیل شده حذف می شود و دیگر در دفتر نمره ظاهر نمی شود."}},"links":{"hide_student_quiz_results":"مخفی کردن نتایج آزمون دانشجو","hide_student_survey_results":"مخفی کردن نتایج نظرسنجی دانشجو","show_student_quiz_results":"نمایش نتایج آزمون دانشجو","show_student_survey_results":"نمایش نتایج نظرسنجی دانشجو"},"students_who_have_not_taken_the_quiz":"دانشجویانی که امتحان نداده اند","students_who_have_taken_the_quiz":"دانشجویانی که امتحان داده اند"}}},"fi":{"quizzes":{"show":{"answers":{"correct":"Oikein!","correct_answers":"Oikeat vastaukset","incorrect":"Väärin","partial":"Osittainen","right":"Oikea vastaus","unanswered":"Vastaamaton","you_answered":"Vastasit"},"buttons":{"already_published":"Julkaistu!","publishing":"Julkaistaan..."},"confirms":{"delete_quiz":"Haluatko varmasti poistaa tämän tietovisan?","delete_quiz_submissions_warning":{"one":"Varoitus: 1 opiskelija on jo osallistunut tähän kyselyyn. Jos poistat sen, kaikki valmiit lähetykset poistetaan eikä niitä näy enää arvosanakirjassa.","other":"Varoitus: %{count} opiskelijaa on jo sallistunut tähän tietovisaan. Jos poistat sen, kaikki valmiit lähetykset poistetaan eikä niitä näy enää arvosanakirjassa."}},"links":{"hide_student_quiz_results":"Piilota opiskelijan tietovisan tulokset","hide_student_survey_results":"Piilota opiskelijan tietovisan tulokset","show_student_quiz_results":"Näytä opiskelijan tietovisan tulokset","show_student_survey_results":"Näytä opiskelijan tietovisan tulokset"},"students_who_have_not_taken_the_quiz":"Opiskelijat, jotka EIVÄT OLE suorittaneet tietovisaa","students_who_have_taken_the_quiz":"Opiskelijat, jotka ovat suorittaneet tietovisan"}}},"fr":{"quizzes":{"show":{"answers":{"correct":"Correct !","correct_answers":"Réponses correctes","incorrect":"Incorrect","partial":"Partiel","right":"Bonne réponse","unanswered":"Sans réponse","you_answered":"Vous avez répondu"},"buttons":{"already_published":"Publication terminée.","publishing":"Publication en cours..."},"confirms":{"delete_quiz":"Voulez-vous vraiment supprimer ce questionnaire ?","delete_quiz_submissions_warning":{"one":"Avertissement: 1 étudiant a déjà complété ce questionnaire. Si vous le supprimez, tous les envois complétés seront supprimés et n’apparaîtront plus dans le relevé de notes.","other":"Avertissement : %{count} étudiants ont déjà complété ce questionnaire. Si vous le supprimez, tous les envois complétés seront supprimés et n’apparaîtront plus dans le relevé de notes."}},"links":{"hide_student_quiz_results":"Masquer les résultats du questionnaire pour l’étudiant","hide_student_survey_results":"Masquer les résultats de l’enquête pour l’étudiant","show_student_quiz_results":"Afficher les résultats du questionnaire pour l’étudiant","show_student_survey_results":"Afficher les résultats de l’enquête pour l’étudiant"},"students_who_have_not_taken_the_quiz":"Étudiants qui n’ont PAS complété le questionnaire","students_who_have_taken_the_quiz":"Étudiants qui ont complété le questionnaire"}}},"fr-CA":{"quizzes":{"show":{"answers":{"correct":"Correct!","correct_answers":"Réponses correctes","incorrect":"Incorrect","partial":"Partiel","right":"Réponse correcte","unanswered":"Sans réponse","you_answered":"Vous avez répondu"},"buttons":{"already_published":"Publication terminée.","publishing":"Publication en cours..."},"confirms":{"delete_quiz":"Voulez-vous vraiment supprimer ce questionnaire?","delete_quiz_submissions_warning":{"one":"Avertissement: 1 étudiant a déjà complété ce questionnaire. Si vous le supprimez, tous les envois complétés seront supprimés et n’apparaîtront plus dans le relevé de notes.","other":"Avertissement : %{count} étudiants ont déjà complété ce questionnaire. Si vous le supprimez, tous les envois complétés seront supprimés et n’apparaîtront plus dans le relevé de notes."}},"links":{"hide_student_quiz_results":"Masquer les résultats du questionnaire pour l’étudiant","hide_student_survey_results":"Masquer les résultats de l’enquête pour l’étudiant","show_student_quiz_results":"Afficher les résultats du questionnaire pour l’étudiant","show_student_survey_results":"Afficher les résultats de l’enquête pour l’étudiant"},"students_who_have_not_taken_the_quiz":"Étudiants qui n’ont PAS complété le questionnaire","students_who_have_taken_the_quiz":"Étudiants qui ont complété le questionnaire"}}},"he":{"quizzes":{"show":{"answers":{"correct":"נכון!","correct_answers":"תשובות נכונות","incorrect":"לא נכון","partial":"חלקי","right":"תשובה נכונה","unanswered":"ללא מענה","you_answered":"השבת"},"buttons":{"already_published":"פורסם!","publishing":"מפרסם..."},"confirms":{"delete_quiz":"האם אתם בטוחים שרוצים לבטל בוחן זה?","delete_quiz_submissions_warning":{"one":"אזהרה: תלמידים אחד כבר לקח את הבוחן. אם יתבטל, תבוטלנה גם כל ההגשות שהושלמו ולא תופענה בספר הציונים.","other":"אזהרה: %{count} תלמידים כבר עשו את הבוחן. אם יתבטל, יבוטלו גם כל ההגשות שהושלמו ולא יופיעו בספר הציונים."}},"links":{"hide_student_quiz_results":"הסתרת תוצאות בוחן תלמיד","hide_student_survey_results":"הסתרת תוצאות סקר תלמיד","show_student_quiz_results":"הצגת תוצאות בוחן תלמיד ","show_student_survey_results":"הצגת תוצאות סקר תלמיד "},"students_who_have_not_taken_the_quiz":"תלמידים שלא עשו את הבוחן","students_who_have_taken_the_quiz":"תלמידים שעשו את הבוחן"}}},"ht":{"quizzes":{"show":{"answers":{"correct":"Kòrèk!","correct_answers":"Repons Kòrèk","incorrect":"Enkòrèk","partial":"Pasyèl","right":"Bon Repons","unanswered":"San Repons","you_answered":"Ou Reponn"},"buttons":{"already_published":"Pibliye!","publishing":"Piblikasyon..."},"confirms":{"delete_quiz":"Ou kwè vrèman ou vle efase quiz sa a?","delete_quiz_submissions_warning":{"one":"Avètisman: 1 elèv pran quiz sa a deja. Si w efase li, tout soumisyon ki konplete deja yo ap efase e yo pa p parèt nan Gradebook la ankò.","other":"Avètisman: %{count} elèv pran quiz sa a deja. Si w efase li, tout soumisyon ki konplete deja yo ap efase e yo pa p parèt nan Gradebook la ankò."}},"links":{"hide_student_quiz_results":"Kache Rezilta Quiz Elèv","hide_student_survey_results":"Kache Rezilta Ankèt Elèv","show_student_quiz_results":"Afiche Rezilta Quiz Elèv","show_student_survey_results":"Afiche Rezilta Ankèt Elèv"},"students_who_have_not_taken_the_quiz":"Elèv ki PA pran quiz la","students_who_have_taken_the_quiz":"Elèv ki pran quiz la"}}},"hu":{"quizzes":{"show":{"answers":{"correct":"Helyes!","correct_answers":"Helyes válaszok","incorrect":"Helytelen","partial":"Részleges","right":"Helyes válasz","unanswered":"Nincs megválaszolva","you_answered":"Megadott válasz"},"buttons":{"already_published":"Publikálva!","publishing":"Publikálás alatt..."},"confirms":{"delete_quiz":"Biztos, hogy törölni szeretné ezt a kvízt?","delete_quiz_submissions_warning":{"one":"Figyelmeztetés: 1 hallgató már kitöltötte ezt a kvízt. Ha törli, minden teljesített feladat törlődik és többé nem jelenik meg az eredménye a naplóban.","other":"Figyelem! %{count} hallgató már kitöltötte ezt a kvízt. Ha ezt törli, minden beadott feladat törlődik, és többé nem jelenik meg az eredmény az osztálynaplóban."}},"links":{"hide_student_quiz_results":"A hallgató kvízeredményeinek elrejtése","hide_student_survey_results":"A hallgatói felmérés eredményeinek elrejtése","show_student_quiz_results":"A hallgatói kvíz eredményeinek megjelenítése","show_student_survey_results":"A hallgatói felmérés eredményeinek megjelenítése"},"students_who_have_not_taken_the_quiz":"Hallgatók, akik NEM töltötték ki a kvízt","students_who_have_taken_the_quiz":"Hallgatók, akik kitöltötték a kvízt"}}},"hy":{"quizzes":{"show":{"answers":{"correct":"Ճիշտ է:","correct_answers":"Ճիշտ պատասխաններ","incorrect":"Սխալ է","partial":"Մասամբ","right":"Ճիշտ պատասխան","unanswered":"Պատասխան չկա","you_answered":"Ձեր պատասխանը"},"buttons":{"already_published":"Հրատարակված է","publishing":"Հրատարակվում է..."},"confirms":{"delete_quiz":"Դուք իսկապե՞ս ցանկանում եք ջնջել այս թեստը:","delete_quiz_submissions_warning":{"one":"Նախազգուշացում. 1  ուսանող արդեն կատարել է այս ստուգողական աշխատանքը: Եթե այն ջնջեք, ցանկացած ուղարկված աշխատանքներ կջնջվեն և այլևս չեն երևա ստուգարքի գրքույկում:","other":"Նախազգուշացում. %{count}  ունկնդիր արդեն կատարել են այս թեստը: Եթե այն ջնջեք, բոլոր ուղարկված աշխատանքները կջնջվեն և այլևս չեն երևա գնահատականների մատյանում:"}},"links":{"hide_student_quiz_results":"Թաքցնել ունկնդրի թեստի արդյունքները","hide_student_survey_results":"Թաքցնել ունկնդրի հարցման արդյունքները","show_student_quiz_results":"Ցույց տալ ունկնդրի թեստի արդյունքները","show_student_survey_results":"Ցույց տալ ունկնդրի հարցման արդյունքները"},"students_who_have_not_taken_the_quiz":"Այն ունկնդիրները, ովքեր ՉԵՆ ստացել թեստը","students_who_have_taken_the_quiz":"Այն ունկնդիրները, ովքեր ստացել են թեստը"}}},"is":{"quizzes":{"show":{"answers":{"correct":"Rétt!","correct_answers":"Rétt svör","incorrect":"Rangt","partial":"Að hluta","right":"Rétt svar","unanswered":"Ósvarað","you_answered":"Þú svaraðir"},"buttons":{"already_published":"Birt!","publishing":"Birti..."},"confirms":{"delete_quiz":"Viltu örugglega eyða þessu prófi?","delete_quiz_submissions_warning":{"one":"Viðvörun: 1 nemandi hefur þegar tekið þetta próf. Ef þú eyðir því, verður loknum skilum eytt og birtast ekki framar í einkunnabókinni.","other":"Viðvörun: %{count} nemendur hafa þegar tekið þetta próf. Ef þú eyðir því, verður loknum skilum eytt og birtast ekki framar í einkunnabókinni."}},"links":{"hide_student_quiz_results":"Fela prófniðurstöður nemenda","hide_student_survey_results":"Fela könnunarniðurstöður nemenda","show_student_quiz_results":"Sýna prófniðurstöður nemenda","show_student_survey_results":"Sýna könnunarniðurstöður nemenda"},"students_who_have_not_taken_the_quiz":"Nemendur sem hafa EKKI tekið prófið","students_who_have_taken_the_quiz":"Nemendur sem hafa tekið prófið"}}},"it":{"quizzes":{"show":{"answers":{"correct":"Corretto.","correct_answers":"Risposte corrette","incorrect":"Errato","partial":"Parziale","right":"Risposta corretta","unanswered":"Senza risposta","you_answered":"Hai risposto"},"buttons":{"already_published":"Pubblicato.","publishing":"Pubblicazione in corso..."},"confirms":{"delete_quiz":"Vuoi eliminare questo quiz?","delete_quiz_submissions_warning":{"one":"Avviso: 1 studente ha già eseguito questo quiz. Se lo elimini, tutte le consegne completate verranno eliminate e non verranno più visualizzate nel registro dei voti.","other":"Avviso: %{count} studenti hanno già eseguito questo quiz. Se lo elimini, tutte le consegne completate verranno eliminate e non verranno più visualizzate nel registro dei voti."}},"links":{"hide_student_quiz_results":"Nascondi risultati quiz studenti","hide_student_survey_results":"Nascondi risultati sondaggio studenti","show_student_quiz_results":"Mostra risultati quiz studenti","show_student_survey_results":"Mostra risultati sondaggio studenti"},"students_who_have_not_taken_the_quiz":"Studenti che NON hanno eseguito il quiz","students_who_have_taken_the_quiz":"Studenti che hanno eseguito il quiz"}}},"ja":{"quizzes":{"show":{"answers":{"correct":"正解です!","correct_answers":"正解","incorrect":"不正解","partial":"部分的","right":"正解","unanswered":"未解答","you_answered":"解答済み"},"buttons":{"already_published":"公開されました!","publishing":"公開しています..."},"confirms":{"delete_quiz":"このクイズを削除してもよろしいですか?","delete_quiz_submissions_warning":{"one":"警告: %{count} 人の受講生が既にこのクイズに答えています。このクイズを削除すると、提出記録が削除され、成績表に表示されなくなります。","other":"警告: %{count} 人の受講生が既にこのクイズに答えています。このクイズを削除すると、提出記録が削除され、成績表に表示されなくなります。"}},"links":{"hide_student_quiz_results":"受講生のクイズの結果を非表示","hide_student_survey_results":"受講生のサーベイの結果を非表示","show_student_quiz_results":"受講生のクイズの結果を表示","show_student_survey_results":"受講生のサーベイの結果を表示"},"students_who_have_not_taken_the_quiz":"まだこのクイズを受けていない受講生","students_who_have_taken_the_quiz":"すでにこのクイズを受けた受講生"}}},"ko":{"quizzes":{"show":{"answers":{"correct":"정답입니다!","correct_answers":"정답","incorrect":"오답","partial":"부분","right":"정답","unanswered":"답변 안 함","you_answered":"여러분의 답변은"},"buttons":{"already_published":"게시되었습니다!","publishing":"게시 중..."},"confirms":{"delete_quiz":"이 퀴즈를 삭제하시겠습니까?","delete_quiz_submissions_warning":{"one":"주의: 학생 %{count}명이 이미 이 퀴즈를 치렀습니다. 이를 삭제하면 완료된 제출물이 삭제되어 평가 기록부에 나타나지 않습니다.","other":"주의: 학생 %{count}명이 이미 이 퀴즈를 치렀습니다. 이를 삭제하면 완료된 제출물이 삭제되어 평가 기록부에 나타나지 않습니다."}},"links":{"hide_student_quiz_results":"학생 퀴즈 결과를 숨기기","hide_student_survey_results":"학생 설문 결과를 숨기기","show_student_quiz_results":"학생 퀴즈 결과 표시","show_student_survey_results":"학생 설문 결과 표시"},"students_who_have_not_taken_the_quiz":"이 퀴즈를 치르지 않은 학생","students_who_have_taken_the_quiz":"이 퀴즈를 치른 학생"}}},"mi":{"quizzes":{"show":{"answers":{"correct":"Tika!","correct_answers":"whakautu tika","incorrect":"hē","partial":"Motunga","right":"Whakautu Tika","unanswered":"Kaore i whakautua","you_answered":"Whakautua koe"},"buttons":{"already_published":"I whakaputaina!","publishing":"Whakaputa ..."},"confirms":{"delete_quiz":"E tino hiahia ana koe ki te muku i tēnei quiz?","delete_quiz_submissions_warning":{"one":"Whakatūpato: Kua tangohia kē 1 ngā ākonga i tēnei quiz. Ki te muku koe, ka mukua tētahi tāpaetanga oti a heoi kaore e puta i roto i te pukakōeke.","other":"Whakatūpato: Kua tangohia kē %{count} ngā ākonga i tēnei quiz. Ki te muku, ka mukua tētahi tāpaetanga oti a heoi kaore e puta i roto i te pukakōeke."}},"links":{"hide_student_quiz_results":"Huna Ākonga Quiz Hua","hide_student_survey_results":"Huna rangahau Ākonga Hua","show_student_quiz_results":"Whakāturia Ākonga Quiz Hua","show_student_survey_results":"Whakāturia rangahau Ākonga Hua"},"students_who_have_not_taken_the_quiz":"Ngā ākonga nei KAORE tangohia te quiz","students_who_have_taken_the_quiz":"Ngā ākonga nei i tango i te quiz"}}},"nb":{"quizzes":{"show":{"answers":{"correct":"Riktig!","correct_answers":"Riktige svar","incorrect":"Feil","partial":"Delvis","right":"Riktig svar","unanswered":"Ubesvart","you_answered":"Du svarte"},"buttons":{"already_published":"Publisert!","publishing":"Publiserer…"},"confirms":{"delete_quiz":"Er du sikker på at du ønsker å slette denne testen?","delete_quiz_submissions_warning":{"one":"Advarsel: 1 student har allerede tatt denne testen. Om du sletter den vil alle fullførte innleveringer slettes og fjernes fra karakteroversikten.","other":"Advarsel: %{count} studenter har allerede tatt denne testen. Om du sletter den vil alle fullførte innleveringer slettes og fjernes fra karakteroversikten."}},"links":{"hide_student_quiz_results":"Skjul studentens testeresultater","hide_student_survey_results":"Skjul resultatene av studentundersøkelsen","show_student_quiz_results":"Vis studentens testeresultater","show_student_survey_results":"Vis resultater fra studentundersøkelsen"},"students_who_have_not_taken_the_quiz":"Studenter som IKKE har tatt testen","students_who_have_taken_the_quiz":"Studenter som har tatt testen"}}},"nb-x-k12":{"quizzes":{"show":{"answers":{"correct":"Riktig!","correct_answers":"Riktige svar","incorrect":"Feil","partial":"Delvis","right":"Riktig svar","unanswered":"Ubesvart","you_answered":"Du svarte"},"buttons":{"already_published":"Publisert!","publishing":"Publiserer…"},"confirms":{"delete_quiz":"Er du sikker på at du ønsker å slette denne testen?","delete_quiz_submissions_warning":{"one":"Advarsel: 1 elev har allerede tatt denne testen. Om du sletter den vil alle fullførte innleveringer slettes og fjernes fra vurderingsoversikten.","other":"Advarsel: %{count} elever har allerede tatt denne testen. Om du sletter den vil alle fullførte innleveringer slettes og fjernes fra vurderingsoversikten."}},"links":{"hide_student_quiz_results":"Skjul elevens testeresultater","hide_student_survey_results":"Skjul resultatene av elevundersøkelsen","show_student_quiz_results":"Vis elevens testeresultater","show_student_survey_results":"Vis resultater fra elevundersøkelsen"},"students_who_have_not_taken_the_quiz":"Elever som IKKE har tatt testen","students_who_have_taken_the_quiz":"Elever som har tatt testen"}}},"nl":{"quizzes":{"show":{"answers":{"correct":"Juist!","correct_answers":"Juiste antwoord","incorrect":"Onjuist","partial":"Gedeeltelijk","right":"Juiste antwoord","unanswered":"Onbeantwoord","you_answered":"Je antwoordde"},"buttons":{"already_published":"Gepubliceerd!","publishing":"Bezig met publiceren..."},"confirms":{"delete_quiz":"Weet je zeker dat je deze toets wilt verwijderen?","delete_quiz_submissions_warning":{"one":"Waarschuwing: 1 cursist heeft deze toets al afgelegd. Bij het verwijderen hiervan zal iedere voltooide inzending verwijderd worden en zal niet langer zichtbaar zijn in het cijferoverzicht.","other":"Waarschuwing: %{count} cursisten hebben deze toets al afgelegd. Bij het verwijderen hiervan zullen alle inzendingen verwijderd worden en zullen niet langer zichtbaar zijn in het cijferoverzicht."}},"links":{"hide_student_quiz_results":"Toetsresultaten van cursisten verbergen","hide_student_survey_results":"Enquêteresultaten van cursisten verbergen","show_student_quiz_results":"Toetsresultaten van cursisten tonen","show_student_survey_results":"Enquêteresultaten van cursisten tonen"},"students_who_have_not_taken_the_quiz":"Cursisten die de toets nog NIET afgelegd hebben","students_who_have_taken_the_quiz":"Cursisten die de toets afgelegd hebben"}}},"nn":{"quizzes":{"show":{"answers":{"correct":"Rett!","correct_answers":"Rette svar","incorrect":"Feil","partial":"Delvis","right":"Rett svar","unanswered":"Ikkje svart på","you_answered":"Du har svart"},"buttons":{"already_published":"Publisert!","publishing":"Publiserer..."},"confirms":{"delete_quiz":"Er du sikker på at du vil slette denne quizen?","delete_quiz_submissions_warning":{"one":"Åtvaring: 1 student har allereie tatt quizen. Dersom du slettar, vil alle fullførte innleveringar bli sletta og dei vil ikkje lenger vere synlege i karakterboka.","other":"Åtvaring: %{count} studentar har allereie tatt quizen. Dersom du slettar, vil alle fullførte innleveringar bli sletta og dei vil ikkje lenger vere synlege i vurderingsoversikta."}},"links":{"hide_student_quiz_results":"Skjul studenten sine quizresultat","hide_student_survey_results":"Skjul resultata frå studentundersøkinga","show_student_quiz_results":"Vis studentane sine resultat frå quizen","show_student_survey_results":"Vis studentane sine resultat frå undersøkinga"},"students_who_have_not_taken_the_quiz":"Studentar som IKKJE har tatt quizen","students_who_have_taken_the_quiz":"Studentar som har tatt quizen"}}},"pl":{"quizzes":{"show":{"answers":{"correct":"Poprawnie!","correct_answers":"Prawidłowe Odpowiedzi","incorrect":"Niepoprawnie","partial":"Częściowo","right":"Prawidłowa odpowiedź","unanswered":"Bez odpowiedzi","you_answered":"Odpowiedziano"},"buttons":{"already_published":"Opublikowano!","publishing":"Trwa publikowanie..."},"confirms":{"delete_quiz":"Czy na pewno chcesz usunąć ten test?","delete_quiz_submissions_warning":{"one":"Ostrzeżenie: 1 uczestnik rozwiązał ten quiz. Jeśli go usuniesz, wszystkie przekazane rozwiązania zostaną usunięte i nie będą dłużej widoczne  w dzienniku.","other":"Ostrzeżenie: %{count} uczestników rozwiązało ten test. Jeśli go usuniesz, wszystkie przekazane rozwiązania zostaną usunięte i nie będą dłużej widoczne  w dzienniku."}},"links":{"hide_student_quiz_results":"Ukryj rezultaty testu uczestnika","hide_student_survey_results":"Ukryj wyniki ankiety uczestnika","show_student_quiz_results":"Wyświetl wyniki testu uczestnika","show_student_survey_results":"Wyświetl wyniki ankiety uczestnika"},"students_who_have_not_taken_the_quiz":"Uczestnicy, którzy NIE napisali testu","students_who_have_taken_the_quiz":"Uczestnicy, którzy już napisali test"}}},"pt":{"quizzes":{"show":{"answers":{"correct":"Correto!","correct_answers":"Respostas corretas","incorrect":"Incorreto","partial":"Parcial","right":"Resposta correta","unanswered":"Sem resposta","you_answered":"Respondeu"},"buttons":{"already_published":"Publicado!","publishing":"A publicar..."},"confirms":{"delete_quiz":"Tem certeza de que deseja excluir este teste?","delete_quiz_submissions_warning":{"one":"Aviso: 1 aluno já realizou este teste. Se eliminar o teste, todos os envios concluídos serão eliminados e deixarão de aparecer no livro de notas.","other":"Aviso: %{count} alunos já realizaram este teste. Se eliminar o teste, todos os envios concluídos serão eliminados e deixarão de aparecer no livro de notas."}},"links":{"hide_student_quiz_results":"Ocultar resultados do teste do aluno","hide_student_survey_results":"Ocultar resultados do questionário do aluno","show_student_quiz_results":"Exibir resultados do teste do aluno","show_student_survey_results":"Exibir resultados do questionário do aluno"},"students_who_have_not_taken_the_quiz":"Alunos que NÃO fizeram o teste","students_who_have_taken_the_quiz":"Alunos que fizeram o teste"}}},"pt-BR":{"quizzes":{"show":{"answers":{"correct":"Correto!","correct_answers":"Respostas corretas","incorrect":"Incorreta","partial":"Parcial","right":"Resposta correta","unanswered":"Não respondida","you_answered":"Você respondeu"},"buttons":{"already_published":"Publicado!","publishing":"Publicando..."},"confirms":{"delete_quiz":"Tem certeza de que deseja excluir este teste?","delete_quiz_submissions_warning":{"one":"Aviso: 1 aluno já fez este teste. Se você excluí-lo, todos os envios concluídos serão excluídos e não apareceram mais no boletim.","other":"Aviso: %{count} alunos já fizeram este teste. Se você excluí-lo, todos os envios concluídos serão excluídos e não apareceram mais no boletim."}},"links":{"hide_student_quiz_results":"Ocultar os resultados do teste do aluno","hide_student_survey_results":"Ocultar resultados da pesquisa do aluno","show_student_quiz_results":"Exibir resultados do teste do aluno","show_student_survey_results":"Exibir resultados da pesquisa do aluno"},"students_who_have_not_taken_the_quiz":"Alunos que NÃO fizeram o teste","students_who_have_taken_the_quiz":"Alunos que fizeram o teste"}}},"ru":{"quizzes":{"show":{"answers":{"correct":"Верно!","correct_answers":"Правильные ответы","incorrect":"Неверно","partial":"Частично","right":"Это правильный ответ","unanswered":"Нет ответа","you_answered":"Ваш ответ"},"buttons":{"already_published":"Опубликовано!","publishing":"Публикация..."},"confirms":{"delete_quiz":"Действительно хотите удалить эту контрольную работу?","delete_quiz_submissions_warning":{"one":"Предупреждение: 1 студент уже прошел данный тест. Если вы удалите его, любое завершенное задание будет удалено и не будет отображаться в зачетной книжке.","other":"Предупреждение: %{count} студента/ов уже прошли данный тест. Если вы удалите его, любое завершенное задание будет удалено и не будет отображаться в зачетной книжке."}},"links":{"hide_student_quiz_results":"Скрыть результаты контрольной работы студента","hide_student_survey_results":"Скрыть результаты опроса студента","show_student_quiz_results":"Показать результаты контрольной работы студента","show_student_survey_results":"Показать результаты опроса студента"},"students_who_have_not_taken_the_quiz":"Студенты, НЕ взявшие контрольную работу","students_who_have_taken_the_quiz":"Студенты, взявшие контрольную работу"}}},"sl":{"quizzes":{"show":{"answers":{"correct":"Pravilno.","correct_answers":"Pravilni odgovori","incorrect":"Nepravilno","partial":"Delno","right":"Pravilen odgovor","unanswered":"Neodgovorjeno","you_answered":"Odgovorili ste."},"buttons":{"already_published":"Objavljeno.","publishing":"Objavljanje ..."},"confirms":{"delete_quiz":"Ali ste prepričani, da želite izbrisati ta kviz?","delete_quiz_submissions_warning":{"one":"Opozorilo: 1 študent je že opravil ta kviz. Če ga izbrišete, bodo vse zaključene oddaje izbrisane in se ne bodo več pojavile v redovalnici.","other":"Opozorilo: %{count} študentov je že opravilo ta kviz. Če ga izbrišete, bodo vse zaključene oddaje izbrisane in se ne bodo več pojavile v redovalnici."}},"links":{"hide_student_quiz_results":"Skrij rezultate kviza študentov","hide_student_survey_results":"Skrij rezultate ankete študentov","show_student_quiz_results":"Pokaži rezultate kviza študentov","show_student_survey_results":"Pokaži rezultate ankete študentov"},"students_who_have_not_taken_the_quiz":"Študenti, ki NISO opravljali kviza.","students_who_have_taken_the_quiz":"Študenti, ki so opravljali kviz."}}},"sv":{"quizzes":{"show":{"answers":{"correct":"Korrekt!","correct_answers":"Korrekta svar","incorrect":"Inkorrekt","partial":"Delvis","right":"Rätt svar","unanswered":"Obesvarad","you_answered":"Du svarade"},"buttons":{"already_published":"Publicerad!","publishing":"Publicerar..."},"confirms":{"delete_quiz":"Är du säker på att du vill radera detta Quiz?","delete_quiz_submissions_warning":{"one":"Varning: 1 student har redan tagit detta Quiz. Om du raderar den kommer även färdiga inlämningar raderas och inte längre synas i omdömesboken.","other":"Varning: %{count} har redan tagit detta Quiz. Om du raderar den kommer även färdig inlämningar att raderas och inte längre synas i omdömesboken."}},"links":{"hide_student_quiz_results":"Dölj studentens quizresultat","hide_student_survey_results":"Dölj studentens undersökningsresultat","show_student_quiz_results":"Visa studentens quizresultat","show_student_survey_results":"Visa studentens undersökningsresultat"},"students_who_have_not_taken_the_quiz":"Studenter som INTE har tagit Quiz","students_who_have_taken_the_quiz":"Studenter som har tagit Quiz"}}},"sv-x-k12":{"quizzes":{"show":{"answers":{"correct":"Korrekt!","correct_answers":"Korrekta svar","incorrect":"Inkorrekt","partial":"Delvis","right":"Rätt svar","unanswered":"Obesvarad","you_answered":"Du svarade"},"buttons":{"already_published":"Publicerad!","publishing":"Publicerar..."},"confirms":{"delete_quiz":"Är du säker på att du vill radera detta Quiz?","delete_quiz_submissions_warning":{"one":"Varning: 1 elev har redan tagit detta Quiz. Om du raderar den kommer även fullgjorda inlämningar raderas och inte längre synas i bedömningsöversikten.","other":"Varning: %{count} har redan tagit detta Quiz. Om du raderar den kommer även fullgjorda inlämningar att raderas och inte längre synas i bedömningsöversikten."}},"links":{"hide_student_quiz_results":"Dölj elevens quizresultat","hide_student_survey_results":"Dölj elevens undersökningsresultat","show_student_quiz_results":"Visa elevens quizresultat","show_student_survey_results":"Visa elevens undersökningsresultat"},"students_who_have_not_taken_the_quiz":"Elever som INTE har tagit Quiz","students_who_have_taken_the_quiz":"Elever som har tagit Quiz"}}},"tr":{"quizzes":{"show":{"answers":{"correct":"Doğru!","correct_answers":"Doğru Cevaplar","incorrect":"Yanlış","partial":"Kısmi","right":"Doğru Cevap","unanswered":"Cevaplanmamış","you_answered":"Sizin Cevabınız"},"buttons":{"already_published":"Yayınlandı!","publishing":"Yayınlanıyor..."},"confirms":{"delete_quiz":"Kısa sınavı silmek istediğinize emin misiniz?","delete_quiz_submissions_warning":{"one":"Uyarı : 1 öğrenci zaten bu kısa sınava giriş yaptı. Eğer silerseniz , tamamlanmış gönderiler silinecek ve notlar kısmında gözükmeyecektir.","other":"Uyarı : %{count} öğrenci zaten bu kısa sınava giriş yaptı. Eğer silerseniz , tamamlanmış gönderiler silinecek ve notlar kısmında gözükmeyecektir."}},"links":{"hide_student_quiz_results":"Öğrenci Kısa Sınav Sonuçlarını Gizle","hide_student_survey_results":"Öğrenci Anket Sonuçlarını Gizle","show_student_quiz_results":"Kısa Sınav İçin Öğrenci Cevaplarını Göster","show_student_survey_results":"Öğrenci Anket Sonuçlarını Göster"},"students_who_have_not_taken_the_quiz":"Kısa sınavı ALMAYAN öğrenciler","students_who_have_taken_the_quiz":"Kısa sınavı alan öğrenciler"}}},"uk":{"quizzes":{"show":{"answers":{"correct":"Правильно!","correct_answers":"Правильні відповіді","incorrect":"Неправильно","partial":"Частково","right":"Правильна відповідь","unanswered":"Без відповіді","you_answered":"Ви відповіли"},"buttons":{"already_published":"Опубліковано!","publishing":"Публікація..."},"confirms":{"delete_quiz":"Ви впевнені, що хочете видалити цей тест?","delete_quiz_submissions_warning":{"one":"Попередження: 1 студент вже виконав цю контрольну роботу. Якщо ви її видалите, всі завершені подання також будуть видалені і більше не відображатимуться у журналі оцінок.","other":"Попередження: %{count} студентів вже виконали цю контрольну роботу. Якщо ви її видалите, всі завершені подання будуть видалені і більше не відображатимуться у журналі оцінок."}},"links":{"hide_student_quiz_results":"Сховати результати контрольної роботи студентів","hide_student_survey_results":"Сховати результати опитування студентів","show_student_quiz_results":"Показати результати студентської контрольної роботи","show_student_survey_results":"Показати результати опитування студентів"},"students_who_have_not_taken_the_quiz":"Студенти, які НЕ виконали контрольну роботу","students_who_have_taken_the_quiz":"Студенти які виконали контрольну роботу"}}},"zh-Hans":{"quizzes":{"show":{"answers":{"correct":"正确!","correct_answers":"正确答案","incorrect":"错误","partial":"部分","right":"正确回答","unanswered":"未回答","you_answered":"您已回答"},"buttons":{"already_published":"已发布!","publishing":"正在发布..."},"confirms":{"delete_quiz":"是否确定要删除此测验?","delete_quiz_submissions_warning":{"one":"警告：%{count} 个学生已参加此测验。若删除，则任何已完成的提交文件也将被删除，再也不会出现在评分册中。","other":"警告：%{count} 个学生已参加此测验。若删除，则任何已完成的提交文件也将被删除，再也不会出现在评分册中。"}},"links":{"hide_student_quiz_results":"隐藏学生测验结果","hide_student_survey_results":"隐藏学生调查结果","show_student_quiz_results":"显示学生测验结果","show_student_survey_results":"显示学生调查结果"},"students_who_have_not_taken_the_quiz":"尚未进行测验的学生","students_who_have_taken_the_quiz":"已进行测验的学生"}}},"zh-Hant":{"quizzes":{"show":{"answers":{"correct":"正確！","correct_answers":"正確答案","incorrect":"不正確","partial":"部分","right":"正確答案","unanswered":"未回答","you_answered":"您已回答"},"buttons":{"already_published":"已發佈！","publishing":"正在發佈…"},"confirms":{"delete_quiz":"您是否確定要刪除此測驗？","delete_quiz_submissions_warning":{"one":"警告：%{count} 個學生已參加了此測驗。如果刪除它，任何已完成的提交件均將被刪除，並且不再出現在成績冊中。","other":"警告：%{count} 個學生已參加了此測驗。如果刪除測驗，任何已完成的提交件均將被刪除，並且不再出現在成績冊中。"}},"links":{"hide_student_quiz_results":"隱藏學生測驗結果","hide_student_survey_results":"隱藏學生調查結果","show_student_quiz_results":"顯示學生測驗結果","show_student_survey_results":"顯示學生調查結果"},"students_who_have_not_taken_the_quiz":"尚未參加測驗的學生","students_who_have_taken_the_quiz":"已參加測驗的學生"}}}}'))
s("jQeR")
s("0sPK")
t["a"]=n["default"].scoped("quizzes.show")},vwFW:function(e,t,s){"use strict"
var n=s("ouhR")
var i=s.n(n)
i()(".question select").bind("mousewheel",e=>e.preventDefault())}}])

//# sourceMappingURL=quiz_history-c-46d3a8b843.js.map