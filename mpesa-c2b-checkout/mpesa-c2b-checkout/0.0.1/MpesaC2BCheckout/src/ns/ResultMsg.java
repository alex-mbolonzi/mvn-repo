
/**
 * ResultMsg.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

package ns;

/**
 * ResultMsg bean class
 */
@SuppressWarnings({ "unchecked", "unused" })

public class ResultMsg implements org.apache.axis2.databinding.ADBBean {

	public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName("tns:ns", "ResultMsg",
			"ns1");

	/**
	 * field for MSISDN
	 */

	protected java.lang.String localMSISDN;

	/**
	 * Auto generated getter method
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getMSISDN() {
		return localMSISDN;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            MSISDN
	 */
	public void setMSISDN(java.lang.String param) {

		this.localMSISDN = param;

	}

	/**
	 * field for AMOUNT
	 */

	protected java.lang.String localAMOUNT;

	/**
	 * Auto generated getter method
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getAMOUNT() {
		return localAMOUNT;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            AMOUNT
	 */
	public void setAMOUNT(java.lang.String param) {

		this.localAMOUNT = param;

	}

	/**
	 * field for MPESA_TRX_DATE
	 */

	protected java.lang.String localMPESA_TRX_DATE;

	/**
	 * Auto generated getter method
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getMPESA_TRX_DATE() {
		return localMPESA_TRX_DATE;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            MPESA_TRX_DATE
	 */
	public void setMPESA_TRX_DATE(java.lang.String param) {

		this.localMPESA_TRX_DATE = param;

	}

	/**
	 * field for MPESA_TRX_ID
	 */

	protected java.lang.String localMPESA_TRX_ID;

	/**
	 * Auto generated getter method
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getMPESA_TRX_ID() {
		return localMPESA_TRX_ID;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            MPESA_TRX_ID
	 */
	public void setMPESA_TRX_ID(java.lang.String param) {

		this.localMPESA_TRX_ID = param;

	}

	/**
	 * field for TRX_STATUS
	 */

	protected java.lang.String localTRX_STATUS;

	/**
	 * Auto generated getter method
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getTRX_STATUS() {
		return localTRX_STATUS;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            TRX_STATUS
	 */
	public void setTRX_STATUS(java.lang.String param) {

		this.localTRX_STATUS = param;

	}

	/**
	 * field for RETURN_CODE
	 */

	protected java.lang.String localRETURN_CODE;

	/**
	 * Auto generated getter method
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getRETURN_CODE() {
		return localRETURN_CODE;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            RETURN_CODE
	 */
	public void setRETURN_CODE(java.lang.String param) {

		this.localRETURN_CODE = param;

	}

	/**
	 * field for DESCRIPTION
	 */

	protected java.lang.String localDESCRIPTION;

	/**
	 * Auto generated getter method
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getDESCRIPTION() {
		return localDESCRIPTION;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            DESCRIPTION
	 */
	public void setDESCRIPTION(java.lang.String param) {

		this.localDESCRIPTION = param;

	}

	/**
	 * field for MERCHANT_TRANSACTION_ID
	 */

	protected java.lang.String localMERCHANT_TRANSACTION_ID;

	/**
	 * Auto generated getter method
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getMERCHANT_TRANSACTION_ID() {
		return localMERCHANT_TRANSACTION_ID;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            MERCHANT_TRANSACTION_ID
	 */
	public void setMERCHANT_TRANSACTION_ID(java.lang.String param) {

		this.localMERCHANT_TRANSACTION_ID = param;

	}

	/**
	 * field for ENC_PARAMS
	 */

	protected java.lang.String localENC_PARAMS;

	/**
	 * Auto generated getter method
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getENC_PARAMS() {
		return localENC_PARAMS;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            ENC_PARAMS
	 */
	public void setENC_PARAMS(java.lang.String param) {

		this.localENC_PARAMS = param;

	}

	/**
	 * field for TRX_ID
	 */

	protected java.lang.String localTRX_ID;

	/**
	 * Auto generated getter method
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getTRX_ID() {
		return localTRX_ID;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            TRX_ID
	 */
	public void setTRX_ID(java.lang.String param) {

		this.localTRX_ID = param;

	}

	/**
	 *
	 * @param parentQName
	 * @param factory
	 * @return org.apache.axiom.om.OMElement
	 */
	public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName,
			final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {

		org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this, MY_QNAME);
		return factory.createOMElement(dataSource, MY_QNAME);

	}

	public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
			throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
		serialize(parentQName, xmlWriter, false);
	}

	public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
			boolean serializeType)
			throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

		java.lang.String prefix = null;
		java.lang.String namespace = null;

		prefix = parentQName.getPrefix();
		namespace = parentQName.getNamespaceURI();
		writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

		if (serializeType) {

			java.lang.String namespacePrefix = registerPrefix(xmlWriter, "tns:ns");
			if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
				writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
						namespacePrefix + ":ResultMsg", xmlWriter);
			} else {
				writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "ResultMsg", xmlWriter);
			}

		}

		namespace = "";
		writeStartElement(null, namespace, "MSISDN", xmlWriter);

		if (localMSISDN == null) {
			// write the nil attribute

			throw new org.apache.axis2.databinding.ADBException("MSISDN cannot be null!!");

		} else {

			xmlWriter.writeCharacters(localMSISDN);

		}

		xmlWriter.writeEndElement();

		namespace = "";
		writeStartElement(null, namespace, "AMOUNT", xmlWriter);

		if (localAMOUNT == null) {
			// write the nil attribute

			throw new org.apache.axis2.databinding.ADBException("AMOUNT cannot be null!!");

		} else {

			xmlWriter.writeCharacters(localAMOUNT);

		}

		xmlWriter.writeEndElement();

		namespace = "";
		writeStartElement(null, namespace, "MPESA_TRX_DATE", xmlWriter);

		if (localMPESA_TRX_DATE == null) {
			// write the nil attribute

			throw new org.apache.axis2.databinding.ADBException("MPESA_TRX_DATE cannot be null!!");

		} else {

			xmlWriter.writeCharacters(localMPESA_TRX_DATE);

		}

		xmlWriter.writeEndElement();

		namespace = "";
		writeStartElement(null, namespace, "MPESA_TRX_ID", xmlWriter);

		if (localMPESA_TRX_ID == null) {
			// write the nil attribute

			throw new org.apache.axis2.databinding.ADBException("MPESA_TRX_ID cannot be null!!");

		} else {

			xmlWriter.writeCharacters(localMPESA_TRX_ID);

		}

		xmlWriter.writeEndElement();

		namespace = "";
		writeStartElement(null, namespace, "TRX_STATUS", xmlWriter);

		if (localTRX_STATUS == null) {
			// write the nil attribute

			throw new org.apache.axis2.databinding.ADBException("TRX_STATUS cannot be null!!");

		} else {

			xmlWriter.writeCharacters(localTRX_STATUS);

		}

		xmlWriter.writeEndElement();

		namespace = "";
		writeStartElement(null, namespace, "RETURN_CODE", xmlWriter);

		if (localRETURN_CODE == null) {
			// write the nil attribute

			throw new org.apache.axis2.databinding.ADBException("RETURN_CODE cannot be null!!");

		} else {

			xmlWriter.writeCharacters(localRETURN_CODE);

		}

		xmlWriter.writeEndElement();

		namespace = "";
		writeStartElement(null, namespace, "DESCRIPTION", xmlWriter);

		if (localDESCRIPTION == null) {
			// write the nil attribute

			throw new org.apache.axis2.databinding.ADBException("DESCRIPTION cannot be null!!");

		} else {

			xmlWriter.writeCharacters(localDESCRIPTION);

		}

		xmlWriter.writeEndElement();

		namespace = "";
		writeStartElement(null, namespace, "MERCHANT_TRANSACTION_ID", xmlWriter);

		if (localMERCHANT_TRANSACTION_ID == null) {
			// write the nil attribute

			throw new org.apache.axis2.databinding.ADBException("MERCHANT_TRANSACTION_ID cannot be null!!");

		} else {

			xmlWriter.writeCharacters(localMERCHANT_TRANSACTION_ID);

		}

		xmlWriter.writeEndElement();

		namespace = "";
		writeStartElement(null, namespace, "ENC_PARAMS", xmlWriter);

		if (localENC_PARAMS == null) {
			// write the nil attribute

			throw new org.apache.axis2.databinding.ADBException("ENC_PARAMS cannot be null!!");

		} else {

			xmlWriter.writeCharacters(localENC_PARAMS);

		}

		xmlWriter.writeEndElement();

		namespace = "";
		writeStartElement(null, namespace, "TRX_ID", xmlWriter);

		if (localTRX_ID == null) {
			// write the nil attribute

			throw new org.apache.axis2.databinding.ADBException("TRX_ID cannot be null!!");

		} else {

			xmlWriter.writeCharacters(localTRX_ID);

		}

		xmlWriter.writeEndElement();

		xmlWriter.writeEndElement();

	}

	private static java.lang.String generatePrefix(java.lang.String namespace) {
		if (namespace.equals("tns:ns")) {
			return "ns1";
		}
		return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
	}

	/**
	 * Utility method to write an element start tag.
	 */
	private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
			javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
		java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
		if (writerPrefix != null) {
			xmlWriter.writeStartElement(namespace, localPart);
		} else {
			if (namespace.length() == 0) {
				prefix = "";
			} else if (prefix == null) {
				prefix = generatePrefix(namespace);
			}

			xmlWriter.writeStartElement(prefix, localPart, namespace);
			xmlWriter.writeNamespace(prefix, namespace);
			xmlWriter.setPrefix(prefix, namespace);
		}
	}

	/**
	 * Util method to write an attribute with the ns prefix
	 */
	private void writeAttribute(java.lang.String prefix, java.lang.String namespace, java.lang.String attName,
			java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter)
			throws javax.xml.stream.XMLStreamException {
		if (xmlWriter.getPrefix(namespace) == null) {
			xmlWriter.writeNamespace(prefix, namespace);
			xmlWriter.setPrefix(prefix, namespace);
		}
		xmlWriter.writeAttribute(namespace, attName, attValue);
	}

	/**
	 * Util method to write an attribute without the ns prefix
	 */
	private void writeAttribute(java.lang.String namespace, java.lang.String attName, java.lang.String attValue,
			javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
		if (namespace.equals("")) {
			xmlWriter.writeAttribute(attName, attValue);
		} else {
			registerPrefix(xmlWriter, namespace);
			xmlWriter.writeAttribute(namespace, attName, attValue);
		}
	}

	/**
	 * Util method to write an attribute without the ns prefix
	 */
	private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
			javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
			throws javax.xml.stream.XMLStreamException {

		java.lang.String attributeNamespace = qname.getNamespaceURI();
		java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
		if (attributePrefix == null) {
			attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
		}
		java.lang.String attributeValue;
		if (attributePrefix.trim().length() > 0) {
			attributeValue = attributePrefix + ":" + qname.getLocalPart();
		} else {
			attributeValue = qname.getLocalPart();
		}

		if (namespace.equals("")) {
			xmlWriter.writeAttribute(attName, attributeValue);
		} else {
			registerPrefix(xmlWriter, namespace);
			xmlWriter.writeAttribute(namespace, attName, attributeValue);
		}
	}

	/**
	 * method to handle Qnames
	 */

	private void writeQName(javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
			throws javax.xml.stream.XMLStreamException {
		java.lang.String namespaceURI = qname.getNamespaceURI();
		if (namespaceURI != null) {
			java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
			if (prefix == null) {
				prefix = generatePrefix(namespaceURI);
				xmlWriter.writeNamespace(prefix, namespaceURI);
				xmlWriter.setPrefix(prefix, namespaceURI);
			}

			if (prefix.trim().length() > 0) {
				xmlWriter.writeCharacters(
						prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
			} else {
				// i.e this is the default namespace
				xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
			}

		} else {
			xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
		}
	}

	private void writeQNames(javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
			throws javax.xml.stream.XMLStreamException {

		if (qnames != null) {
			// we have to store this data until last moment since it is not
			// possible to write any
			// namespace data after writing the charactor data
			java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
			java.lang.String namespaceURI = null;
			java.lang.String prefix = null;

			for (int i = 0; i < qnames.length; i++) {
				if (i > 0) {
					stringToWrite.append(" ");
				}
				namespaceURI = qnames[i].getNamespaceURI();
				if (namespaceURI != null) {
					prefix = xmlWriter.getPrefix(namespaceURI);
					if ((prefix == null) || (prefix.length() == 0)) {
						prefix = generatePrefix(namespaceURI);
						xmlWriter.writeNamespace(prefix, namespaceURI);
						xmlWriter.setPrefix(prefix, namespaceURI);
					}

					if (prefix.trim().length() > 0) {
						stringToWrite.append(prefix).append(":")
								.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
					} else {
						stringToWrite
								.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
					}
				} else {
					stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
				}
			}
			xmlWriter.writeCharacters(stringToWrite.toString());
		}

	}

	/**
	 * Register a namespace prefix
	 */
	private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
			throws javax.xml.stream.XMLStreamException {
		java.lang.String prefix = xmlWriter.getPrefix(namespace);
		if (prefix == null) {
			prefix = generatePrefix(namespace);
			javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
			while (true) {
				java.lang.String uri = nsContext.getNamespaceURI(prefix);
				if (uri == null || uri.length() == 0) {
					break;
				}
				prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
			}
			xmlWriter.writeNamespace(prefix, namespace);
			xmlWriter.setPrefix(prefix, namespace);
		}
		return prefix;
	}

	/**
	 * databinding method to get an XML representation of this object
	 *
	 */
	public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
			throws org.apache.axis2.databinding.ADBException {

		java.util.ArrayList elementList = new java.util.ArrayList();
		java.util.ArrayList attribList = new java.util.ArrayList();

		elementList.add(new javax.xml.namespace.QName("", "MSISDN"));

		if (localMSISDN != null) {
			elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMSISDN));
		} else {
			throw new org.apache.axis2.databinding.ADBException("MSISDN cannot be null!!");
		}

		elementList.add(new javax.xml.namespace.QName("", "AMOUNT"));

		if (localAMOUNT != null) {
			elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAMOUNT));
		} else {
			throw new org.apache.axis2.databinding.ADBException("AMOUNT cannot be null!!");
		}

		elementList.add(new javax.xml.namespace.QName("", "MPESA_TRX_DATE"));

		if (localMPESA_TRX_DATE != null) {
			elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMPESA_TRX_DATE));
		} else {
			throw new org.apache.axis2.databinding.ADBException("MPESA_TRX_DATE cannot be null!!");
		}

		elementList.add(new javax.xml.namespace.QName("", "MPESA_TRX_ID"));

		if (localMPESA_TRX_ID != null) {
			elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMPESA_TRX_ID));
		} else {
			throw new org.apache.axis2.databinding.ADBException("MPESA_TRX_ID cannot be null!!");
		}

		elementList.add(new javax.xml.namespace.QName("", "TRX_STATUS"));

		if (localTRX_STATUS != null) {
			elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTRX_STATUS));
		} else {
			throw new org.apache.axis2.databinding.ADBException("TRX_STATUS cannot be null!!");
		}

		elementList.add(new javax.xml.namespace.QName("", "RETURN_CODE"));

		if (localRETURN_CODE != null) {
			elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRETURN_CODE));
		} else {
			throw new org.apache.axis2.databinding.ADBException("RETURN_CODE cannot be null!!");
		}

		elementList.add(new javax.xml.namespace.QName("", "DESCRIPTION"));

		if (localDESCRIPTION != null) {
			elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDESCRIPTION));
		} else {
			throw new org.apache.axis2.databinding.ADBException("DESCRIPTION cannot be null!!");
		}

		elementList.add(new javax.xml.namespace.QName("", "MERCHANT_TRANSACTION_ID"));

		if (localMERCHANT_TRANSACTION_ID != null) {
			elementList.add(
					org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMERCHANT_TRANSACTION_ID));
		} else {
			throw new org.apache.axis2.databinding.ADBException("MERCHANT_TRANSACTION_ID cannot be null!!");
		}

		elementList.add(new javax.xml.namespace.QName("", "ENC_PARAMS"));

		if (localENC_PARAMS != null) {
			elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localENC_PARAMS));
		} else {
			throw new org.apache.axis2.databinding.ADBException("ENC_PARAMS cannot be null!!");
		}

		elementList.add(new javax.xml.namespace.QName("", "TRX_ID"));

		if (localTRX_ID != null) {
			elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTRX_ID));
		} else {
			throw new org.apache.axis2.databinding.ADBException("TRX_ID cannot be null!!");
		}

		return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(),
				attribList.toArray());

	}

	/**
	 * Factory class that keeps the parse method
	 */
	public static class Factory {

		/**
		 * static method to create the object Precondition: If this object is an
		 * element, the current or next start element starts this object and any
		 * intervening reader events are ignorable If this object is not an
		 * element, it is a complex type and the reader is at the event just
		 * after the outer start element Postcondition: If this object is an
		 * element, the reader is positioned at its end element If this object
		 * is a complex type, the reader is positioned at the end element of its
		 * outer element
		 */
		public static ResultMsg parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
			ResultMsg object = new ResultMsg();

			int event;
			java.lang.String nillableValue = null;
			java.lang.String prefix = "";
			java.lang.String namespaceuri = "";
			try {

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
					java.lang.String fullTypeName = reader
							.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type");
					if (fullTypeName != null) {
						java.lang.String nsPrefix = null;
						if (fullTypeName.indexOf(":") > -1) {
							nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
						}
						nsPrefix = nsPrefix == null ? "" : nsPrefix;

						java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

						if (!"ResultMsg".equals(type)) {
							// find namespace for the prefix
							java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
							return (ResultMsg) ns.ExtensionMapper.getTypeObject(nsUri, type, reader);
						}

					}

				}

				// Note all attributes that were handled. Used to differ normal
				// attributes
				// from anyAttributes.
				java.util.Vector handledAttributes = new java.util.Vector();

				reader.next();

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement() && new javax.xml.namespace.QName("", "MSISDN").equals(reader.getName())) {

					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
					if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
						throw new org.apache.axis2.databinding.ADBException(
								"The element: " + "MSISDN" + "  cannot be null");
					}

					java.lang.String content = reader.getElementText();

					object.setMSISDN(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

					reader.next();

				} // End of if for expected property start element

				else {
					// A start element we are not expecting indicates an invalid
					// parameter was passed
					throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement() && new javax.xml.namespace.QName("", "AMOUNT").equals(reader.getName())) {

					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
					if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
						throw new org.apache.axis2.databinding.ADBException(
								"The element: " + "AMOUNT" + "  cannot be null");
					}

					java.lang.String content = reader.getElementText();

					object.setAMOUNT(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

					reader.next();

				} // End of if for expected property start element

				else {
					// A start element we are not expecting indicates an invalid
					// parameter was passed
					throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement()
						&& new javax.xml.namespace.QName("", "MPESA_TRX_DATE").equals(reader.getName())) {

					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
					if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
						throw new org.apache.axis2.databinding.ADBException(
								"The element: " + "MPESA_TRX_DATE" + "  cannot be null");
					}

					java.lang.String content = reader.getElementText();

					object.setMPESA_TRX_DATE(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

					reader.next();

				} // End of if for expected property start element

				else {
					// A start element we are not expecting indicates an invalid
					// parameter was passed
					throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement()
						&& new javax.xml.namespace.QName("", "MPESA_TRX_ID").equals(reader.getName())) {

					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
					if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
						throw new org.apache.axis2.databinding.ADBException(
								"The element: " + "MPESA_TRX_ID" + "  cannot be null");
					}

					java.lang.String content = reader.getElementText();

					object.setMPESA_TRX_ID(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

					reader.next();

				} // End of if for expected property start element

				else {
					// A start element we are not expecting indicates an invalid
					// parameter was passed
					throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement()
						&& new javax.xml.namespace.QName("", "TRX_STATUS").equals(reader.getName())) {

					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
					if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
						throw new org.apache.axis2.databinding.ADBException(
								"The element: " + "TRX_STATUS" + "  cannot be null");
					}

					java.lang.String content = reader.getElementText();

					object.setTRX_STATUS(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

					reader.next();

				} // End of if for expected property start element

				else {
					// A start element we are not expecting indicates an invalid
					// parameter was passed
					throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement()
						&& new javax.xml.namespace.QName("", "RETURN_CODE").equals(reader.getName())) {

					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
					if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
						throw new org.apache.axis2.databinding.ADBException(
								"The element: " + "RETURN_CODE" + "  cannot be null");
					}

					java.lang.String content = reader.getElementText();

					object.setRETURN_CODE(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

					reader.next();

				} // End of if for expected property start element

				else {
					// A start element we are not expecting indicates an invalid
					// parameter was passed
					throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement()
						&& new javax.xml.namespace.QName("", "DESCRIPTION").equals(reader.getName())) {

					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
					if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
						throw new org.apache.axis2.databinding.ADBException(
								"The element: " + "DESCRIPTION" + "  cannot be null");
					}

					java.lang.String content = reader.getElementText();

					object.setDESCRIPTION(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

					reader.next();

				} // End of if for expected property start element

				else {
					// A start element we are not expecting indicates an invalid
					// parameter was passed
					throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement()
						&& new javax.xml.namespace.QName("", "MERCHANT_TRANSACTION_ID").equals(reader.getName())) {

					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
					if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
						throw new org.apache.axis2.databinding.ADBException(
								"The element: " + "MERCHANT_TRANSACTION_ID" + "  cannot be null");
					}

					java.lang.String content = reader.getElementText();

					object.setMERCHANT_TRANSACTION_ID(
							org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

					reader.next();

				} // End of if for expected property start element

				else {
					// A start element we are not expecting indicates an invalid
					// parameter was passed
					throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement()
						&& new javax.xml.namespace.QName("", "ENC_PARAMS").equals(reader.getName())) {

					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
					if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
						throw new org.apache.axis2.databinding.ADBException(
								"The element: " + "ENC_PARAMS" + "  cannot be null");
					}

					java.lang.String content = reader.getElementText();

					object.setENC_PARAMS(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

					reader.next();

				} // End of if for expected property start element

				else {
					// A start element we are not expecting indicates an invalid
					// parameter was passed
					throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement() && new javax.xml.namespace.QName("", "TRX_ID").equals(reader.getName())) {

					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
					if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
						throw new org.apache.axis2.databinding.ADBException(
								"The element: " + "TRX_ID" + "  cannot be null");
					}

					java.lang.String content = reader.getElementText();

					object.setTRX_ID(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

					reader.next();

				} // End of if for expected property start element

				else {
					// A start element we are not expecting indicates an invalid
					// parameter was passed
					throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement())
					// A start element we are not expecting indicates a trailing
					// invalid property
					throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());

			} catch (javax.xml.stream.XMLStreamException e) {
				throw new java.lang.Exception(e);
			}

			return object;
		}

	}// end of factory class

}
