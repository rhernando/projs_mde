<?xml version = '1.0' encoding = 'ISO-8859-1' ?>
<asm version="1.0" name="0">
	<cp>
		<constant value="petrinet2sd"/>
		<constant value="links"/>
		<constant value="NTransientLinkSet;"/>
		<constant value="col"/>
		<constant value="J"/>
		<constant value="main"/>
		<constant value="A"/>
		<constant value="OclParametrizedType"/>
		<constant value="#native"/>
		<constant value="Collection"/>
		<constant value="J.setName(S):V"/>
		<constant value="OclSimpleType"/>
		<constant value="OclAny"/>
		<constant value="J.setElementType(J):V"/>
		<constant value="TransientLinkSet"/>
		<constant value="A.__matcher__():V"/>
		<constant value="A.__exec__():V"/>
		<constant value="self"/>
		<constant value="__resolve__"/>
		<constant value="1"/>
		<constant value="J.oclIsKindOf(J):B"/>
		<constant value="18"/>
		<constant value="NTransientLinkSet;.getLinkBySourceElement(S):QNTransientLink;"/>
		<constant value="J.oclIsUndefined():B"/>
		<constant value="15"/>
		<constant value="NTransientLink;.getTargetFromSource(J):J"/>
		<constant value="17"/>
		<constant value="30"/>
		<constant value="Sequence"/>
		<constant value="2"/>
		<constant value="A.__resolve__(J):J"/>
		<constant value="QJ.including(J):QJ"/>
		<constant value="QJ.flatten():QJ"/>
		<constant value="e"/>
		<constant value="value"/>
		<constant value="resolveTemp"/>
		<constant value="S"/>
		<constant value="NTransientLink;.getNamedTargetFromSource(JS):J"/>
		<constant value="name"/>
		<constant value="__matcher__"/>
		<constant value="A.__matchPetriNet():V"/>
		<constant value="A.__matchcreatePlace():V"/>
		<constant value="A.__matchcreateArc():V"/>
		<constant value="__exec__"/>
		<constant value="PetriNet"/>
		<constant value="NTransientLinkSet;.getLinksByRule(S):QNTransientLink;"/>
		<constant value="A.__applyPetriNet(NTransientLink;):V"/>
		<constant value="createPlace"/>
		<constant value="A.__applycreatePlace(NTransientLink;):V"/>
		<constant value="createArc"/>
		<constant value="A.__applycreateArc(NTransientLink;):V"/>
		<constant value="__matchPetriNet"/>
		<constant value="StateDiagram"/>
		<constant value="stateDiagram"/>
		<constant value="IN"/>
		<constant value="MMOF!Classifier;.allInstancesFrom(S):QJ"/>
		<constant value="TransientLink"/>
		<constant value="NTransientLink;.setRule(MATL!Rule;):V"/>
		<constant value="sd"/>
		<constant value="NTransientLink;.addSourceElement(SJ):V"/>
		<constant value="p"/>
		<constant value="petriNet"/>
		<constant value="NTransientLink;.addTargetElement(SJ):V"/>
		<constant value="NTransientLinkSet;.addLink2(NTransientLink;B):V"/>
		<constant value="12:3-14:4"/>
		<constant value="__applyPetriNet"/>
		<constant value="NTransientLink;"/>
		<constant value="NTransientLink;.getSourceElement(S):J"/>
		<constant value="NTransientLink;.getTargetElement(S):J"/>
		<constant value="3"/>
		<constant value="13:12-13:14"/>
		<constant value="13:12-13:19"/>
		<constant value="13:4-13:19"/>
		<constant value="link"/>
		<constant value="__matchcreatePlace"/>
		<constant value="State"/>
		<constant value="s"/>
		<constant value="Place"/>
		<constant value="21:3-29:4"/>
		<constant value="__applycreatePlace"/>
		<constant value="isInitial"/>
		<constant value="22"/>
		<constant value="0"/>
		<constant value="23"/>
		<constant value="tokens"/>
		<constant value="22:12-22:13"/>
		<constant value="22:12-22:18"/>
		<constant value="22:4-22:18"/>
		<constant value="23:18-23:19"/>
		<constant value="23:18-23:29"/>
		<constant value="26:6-26:7"/>
		<constant value="24:6-24:7"/>
		<constant value="23:14-27:10"/>
		<constant value="23:4-27:10"/>
		<constant value="createTransition"/>
		<constant value="MstateDiagram!Transition;"/>
		<constant value="tsd"/>
		<constant value="tpn"/>
		<constant value="Transition"/>
		<constant value="next"/>
		<constant value="_trans"/>
		<constant value="J.concat(J):J"/>
		<constant value="39:12-39:15"/>
		<constant value="39:12-39:20"/>
		<constant value="39:12-39:25"/>
		<constant value="39:33-39:41"/>
		<constant value="39:12-39:42"/>
		<constant value="39:4-39:42"/>
		<constant value="38:3-40:5"/>
		<constant value="__matchcreateArc"/>
		<constant value="arc"/>
		<constant value="Arc"/>
		<constant value="47:3-49:5"/>
		<constant value="__applycreateArc"/>
		<constant value="J.createTransition(J):J"/>
		<constant value="output"/>
		<constant value="48:14-48:24"/>
		<constant value="48:42-48:45"/>
		<constant value="48:14-48:46"/>
		<constant value="48:4-48:46"/>
	</cp>
	<field name="1" type="2"/>
	<field name="3" type="4"/>
	<operation name="5">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<getasm/>
			<push arg="7"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="9"/>
			<pcall arg="10"/>
			<dup/>
			<push arg="11"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="12"/>
			<pcall arg="10"/>
			<pcall arg="13"/>
			<set arg="3"/>
			<getasm/>
			<push arg="14"/>
			<push arg="8"/>
			<new/>
			<set arg="1"/>
			<getasm/>
			<pcall arg="15"/>
			<getasm/>
			<pcall arg="16"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="17" begin="0" end="24"/>
		</localvariabletable>
	</operation>
	<operation name="18">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="4"/>
		</parameters>
		<code>
			<load arg="19"/>
			<getasm/>
			<get arg="3"/>
			<call arg="20"/>
			<if arg="21"/>
			<getasm/>
			<get arg="1"/>
			<load arg="19"/>
			<call arg="22"/>
			<dup/>
			<call arg="23"/>
			<if arg="24"/>
			<load arg="19"/>
			<call arg="25"/>
			<goto arg="26"/>
			<pop/>
			<load arg="19"/>
			<goto arg="27"/>
			<push arg="28"/>
			<push arg="8"/>
			<new/>
			<load arg="19"/>
			<iterate/>
			<store arg="29"/>
			<getasm/>
			<load arg="29"/>
			<call arg="30"/>
			<call arg="31"/>
			<enditerate/>
			<call arg="32"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="2" name="33" begin="23" end="27"/>
			<lve slot="0" name="17" begin="0" end="29"/>
			<lve slot="1" name="34" begin="0" end="29"/>
		</localvariabletable>
	</operation>
	<operation name="35">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="4"/>
			<parameter name="29" type="36"/>
		</parameters>
		<code>
			<getasm/>
			<get arg="1"/>
			<load arg="19"/>
			<call arg="22"/>
			<load arg="19"/>
			<load arg="29"/>
			<call arg="37"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="17" begin="0" end="6"/>
			<lve slot="1" name="34" begin="0" end="6"/>
			<lve slot="2" name="38" begin="0" end="6"/>
		</localvariabletable>
	</operation>
	<operation name="39">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<getasm/>
			<pcall arg="40"/>
			<getasm/>
			<pcall arg="41"/>
			<getasm/>
			<pcall arg="42"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="17" begin="0" end="5"/>
		</localvariabletable>
	</operation>
	<operation name="43">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<getasm/>
			<get arg="1"/>
			<push arg="44"/>
			<call arg="45"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<load arg="19"/>
			<pcall arg="46"/>
			<enditerate/>
			<getasm/>
			<get arg="1"/>
			<push arg="47"/>
			<call arg="45"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<load arg="19"/>
			<pcall arg="48"/>
			<enditerate/>
			<getasm/>
			<get arg="1"/>
			<push arg="49"/>
			<call arg="45"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<load arg="19"/>
			<pcall arg="50"/>
			<enditerate/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="33" begin="5" end="8"/>
			<lve slot="1" name="33" begin="15" end="18"/>
			<lve slot="1" name="33" begin="25" end="28"/>
			<lve slot="0" name="17" begin="0" end="29"/>
		</localvariabletable>
	</operation>
	<operation name="51">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<push arg="52"/>
			<push arg="53"/>
			<findme/>
			<push arg="54"/>
			<call arg="55"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<get arg="1"/>
			<push arg="56"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="44"/>
			<pcall arg="57"/>
			<dup/>
			<push arg="58"/>
			<load arg="19"/>
			<pcall arg="59"/>
			<dup/>
			<push arg="60"/>
			<push arg="44"/>
			<push arg="61"/>
			<new/>
			<pcall arg="62"/>
			<pusht/>
			<pcall arg="63"/>
			<enditerate/>
		</code>
		<linenumbertable>
			<lne id="64" begin="19" end="24"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="58" begin="6" end="26"/>
			<lve slot="0" name="17" begin="0" end="27"/>
		</localvariabletable>
	</operation>
	<operation name="65">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="66"/>
		</parameters>
		<code>
			<load arg="19"/>
			<push arg="58"/>
			<call arg="67"/>
			<store arg="29"/>
			<load arg="19"/>
			<push arg="60"/>
			<call arg="68"/>
			<store arg="69"/>
			<load arg="69"/>
			<dup/>
			<getasm/>
			<load arg="29"/>
			<get arg="38"/>
			<call arg="30"/>
			<set arg="38"/>
			<pop/>
		</code>
		<linenumbertable>
			<lne id="70" begin="11" end="11"/>
			<lne id="71" begin="11" end="12"/>
			<lne id="72" begin="9" end="14"/>
			<lne id="64" begin="8" end="15"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="3" name="60" begin="7" end="15"/>
			<lve slot="2" name="58" begin="3" end="15"/>
			<lve slot="0" name="17" begin="0" end="15"/>
			<lve slot="1" name="73" begin="0" end="15"/>
		</localvariabletable>
	</operation>
	<operation name="74">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<push arg="75"/>
			<push arg="53"/>
			<findme/>
			<push arg="54"/>
			<call arg="55"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<get arg="1"/>
			<push arg="56"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="47"/>
			<pcall arg="57"/>
			<dup/>
			<push arg="76"/>
			<load arg="19"/>
			<pcall arg="59"/>
			<dup/>
			<push arg="60"/>
			<push arg="77"/>
			<push arg="61"/>
			<new/>
			<pcall arg="62"/>
			<pusht/>
			<pcall arg="63"/>
			<enditerate/>
		</code>
		<linenumbertable>
			<lne id="78" begin="19" end="24"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="76" begin="6" end="26"/>
			<lve slot="0" name="17" begin="0" end="27"/>
		</localvariabletable>
	</operation>
	<operation name="79">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="66"/>
		</parameters>
		<code>
			<load arg="19"/>
			<push arg="76"/>
			<call arg="67"/>
			<store arg="29"/>
			<load arg="19"/>
			<push arg="60"/>
			<call arg="68"/>
			<store arg="69"/>
			<load arg="69"/>
			<dup/>
			<getasm/>
			<load arg="29"/>
			<get arg="38"/>
			<call arg="30"/>
			<set arg="38"/>
			<dup/>
			<getasm/>
			<load arg="29"/>
			<get arg="80"/>
			<if arg="81"/>
			<pushi arg="82"/>
			<goto arg="83"/>
			<pushi arg="19"/>
			<call arg="30"/>
			<set arg="84"/>
			<pop/>
		</code>
		<linenumbertable>
			<lne id="85" begin="11" end="11"/>
			<lne id="86" begin="11" end="12"/>
			<lne id="87" begin="9" end="14"/>
			<lne id="88" begin="17" end="17"/>
			<lne id="89" begin="17" end="18"/>
			<lne id="90" begin="20" end="20"/>
			<lne id="91" begin="22" end="22"/>
			<lne id="92" begin="17" end="22"/>
			<lne id="93" begin="15" end="24"/>
			<lne id="78" begin="8" end="25"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="3" name="60" begin="7" end="25"/>
			<lve slot="2" name="76" begin="3" end="25"/>
			<lve slot="0" name="17" begin="0" end="25"/>
			<lve slot="1" name="73" begin="0" end="25"/>
		</localvariabletable>
	</operation>
	<operation name="94">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="95"/>
		</parameters>
		<code>
			<getasm/>
			<get arg="1"/>
			<push arg="56"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="94"/>
			<pcall arg="57"/>
			<dup/>
			<push arg="96"/>
			<load arg="19"/>
			<pcall arg="59"/>
			<dup/>
			<push arg="97"/>
			<push arg="98"/>
			<push arg="61"/>
			<new/>
			<dup/>
			<store arg="29"/>
			<pcall arg="62"/>
			<pushf/>
			<pcall arg="63"/>
			<load arg="29"/>
			<dup/>
			<getasm/>
			<load arg="19"/>
			<get arg="99"/>
			<get arg="38"/>
			<push arg="100"/>
			<call arg="101"/>
			<call arg="30"/>
			<set arg="38"/>
			<pop/>
			<load arg="29"/>
		</code>
		<linenumbertable>
			<lne id="102" begin="25" end="25"/>
			<lne id="103" begin="25" end="26"/>
			<lne id="104" begin="25" end="27"/>
			<lne id="105" begin="28" end="28"/>
			<lne id="106" begin="25" end="29"/>
			<lne id="107" begin="23" end="31"/>
			<lne id="108" begin="22" end="32"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="2" name="97" begin="18" end="33"/>
			<lve slot="0" name="17" begin="0" end="33"/>
			<lve slot="1" name="96" begin="0" end="33"/>
		</localvariabletable>
	</operation>
	<operation name="109">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<push arg="98"/>
			<push arg="53"/>
			<findme/>
			<push arg="54"/>
			<call arg="55"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<get arg="1"/>
			<push arg="56"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="49"/>
			<pcall arg="57"/>
			<dup/>
			<push arg="96"/>
			<load arg="19"/>
			<pcall arg="59"/>
			<dup/>
			<push arg="110"/>
			<push arg="111"/>
			<push arg="61"/>
			<new/>
			<pcall arg="62"/>
			<pusht/>
			<pcall arg="63"/>
			<enditerate/>
		</code>
		<linenumbertable>
			<lne id="112" begin="19" end="24"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="96" begin="6" end="26"/>
			<lve slot="0" name="17" begin="0" end="27"/>
		</localvariabletable>
	</operation>
	<operation name="113">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="66"/>
		</parameters>
		<code>
			<load arg="19"/>
			<push arg="96"/>
			<call arg="67"/>
			<store arg="29"/>
			<load arg="19"/>
			<push arg="110"/>
			<call arg="68"/>
			<store arg="69"/>
			<load arg="69"/>
			<dup/>
			<getasm/>
			<getasm/>
			<load arg="29"/>
			<call arg="114"/>
			<call arg="30"/>
			<set arg="115"/>
			<pop/>
		</code>
		<linenumbertable>
			<lne id="116" begin="11" end="11"/>
			<lne id="117" begin="12" end="12"/>
			<lne id="118" begin="11" end="13"/>
			<lne id="119" begin="9" end="15"/>
			<lne id="112" begin="8" end="16"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="3" name="110" begin="7" end="16"/>
			<lve slot="2" name="96" begin="3" end="16"/>
			<lve slot="0" name="17" begin="0" end="16"/>
			<lve slot="1" name="73" begin="0" end="16"/>
		</localvariabletable>
	</operation>
</asm>
