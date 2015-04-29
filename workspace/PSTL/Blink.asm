
Hex/Blink.cpp.hex:     format de fichier ihex


Déassemblage de la section .sec1:

00000000 <.sec1>:
   0:	0c 94 5c 00 	jmp	0xb8	;  0xb8
   4:	0c 94 79 00 	jmp	0xf2	;  0xf2
   8:	0c 94 79 00 	jmp	0xf2	;  0xf2
   c:	0c 94 79 00 	jmp	0xf2	;  0xf2
  10:	0c 94 79 00 	jmp	0xf2	;  0xf2
  14:	0c 94 79 00 	jmp	0xf2	;  0xf2
  18:	0c 94 79 00 	jmp	0xf2	;  0xf2
  1c:	0c 94 79 00 	jmp	0xf2	;  0xf2
  20:	0c 94 79 00 	jmp	0xf2	;  0xf2
  24:	0c 94 79 00 	jmp	0xf2	;  0xf2
  28:	0c 94 79 00 	jmp	0xf2	;  0xf2
  2c:	0c 94 79 00 	jmp	0xf2	;  0xf2
  30:	0c 94 79 00 	jmp	0xf2	;  0xf2
  34:	0c 94 79 00 	jmp	0xf2	;  0xf2
  38:	0c 94 79 00 	jmp	0xf2	;  0xf2
  3c:	0c 94 79 00 	jmp	0xf2	;  0xf2
  40:	0c 94 9a 00 	jmp	0x134	;  0x134
  44:	0c 94 79 00 	jmp	0xf2	;  0xf2
  48:	0c 94 79 00 	jmp	0xf2	;  0xf2
  4c:	0c 94 79 00 	jmp	0xf2	;  0xf2
  50:	0c 94 79 00 	jmp	0xf2	;  0xf2
  54:	0c 94 79 00 	jmp	0xf2	;  0xf2
  58:	0c 94 79 00 	jmp	0xf2	;  0xf2
  5c:	0c 94 79 00 	jmp	0xf2	;  0xf2
  60:	0c 94 79 00 	jmp	0xf2	;  0xf2
  64:	0c 94 79 00 	jmp	0xf2	;  0xf2
  68:	00 00       	nop
  6a:	00 07       	cpc	r16, r16
  6c:	00 02       	muls	r16, r16
  6e:	01 00       	.word	0x0001	; ????
  70:	00 03       	mulsu	r16, r16
  72:	04 06       	cpc	r0, r20
	...
  7c:	01 02       	muls	r16, r17
  7e:	04 08       	sbc	r0, r4
  80:	10 20       	and	r1, r0
  82:	40 80       	ld	r4, Z
  84:	01 02       	muls	r16, r17
  86:	04 08       	sbc	r0, r4
  88:	10 20       	and	r1, r0
  8a:	01 02       	muls	r16, r17
  8c:	04 08       	sbc	r0, r4
  8e:	10 20       	and	r1, r0
  90:	04 04       	cpc	r0, r4
  92:	04 04       	cpc	r0, r4
  94:	04 04       	cpc	r0, r4
  96:	04 04       	cpc	r0, r4
  98:	02 02       	muls	r16, r18
  9a:	02 02       	muls	r16, r18
  9c:	02 02       	muls	r16, r18
  9e:	03 03       	mulsu	r16, r19
  a0:	03 03       	mulsu	r16, r19
  a2:	03 03       	mulsu	r16, r19
  a4:	00 00       	nop
  a6:	00 00       	nop
  a8:	25 00       	.word	0x0025	; ????
  aa:	28 00       	.word	0x0028	; ????
  ac:	2b 00       	.word	0x002b	; ????
  ae:	00 00       	nop
  b0:	00 00       	nop
  b2:	24 00       	.word	0x0024	; ????
  b4:	27 00       	.word	0x0027	; ????
  b6:	2a 00       	.word	0x002a	; ????
  b8:	11 24       	eor	r1, r1
  ba:	1f be       	out	0x3f, r1	; 63
  bc:	cf ef       	ldi	r28, 0xFF	; 255
  be:	d8 e0       	ldi	r29, 0x08	; 8
  c0:	de bf       	out	0x3e, r29	; 62
  c2:	cd bf       	out	0x3d, r28	; 61
  c4:	11 e0       	ldi	r17, 0x01	; 1
  c6:	a0 e0       	ldi	r26, 0x00	; 0
  c8:	b1 e0       	ldi	r27, 0x01	; 1
  ca:	ee e1       	ldi	r30, 0x1E	; 30
  cc:	f4 e0       	ldi	r31, 0x04	; 4
  ce:	02 c0       	rjmp	.+4      	;  0xd4
  d0:	05 90       	lpm	r0, Z+
  d2:	0d 92       	st	X+, r0
  d4:	a2 30       	cpi	r26, 0x02	; 2
  d6:	b1 07       	cpc	r27, r17
  d8:	d9 f7       	brne	.-10     	;  0xd0
  da:	11 e0       	ldi	r17, 0x01	; 1
  dc:	a2 e0       	ldi	r26, 0x02	; 2
  de:	b1 e0       	ldi	r27, 0x01	; 1
  e0:	01 c0       	rjmp	.+2      	;  0xe4
  e2:	1d 92       	st	X+, r1
  e4:	ab 30       	cpi	r26, 0x0B	; 11
  e6:	b1 07       	cpc	r27, r17
  e8:	e1 f7       	brne	.-8      	;  0xe2
  ea:	0e 94 00 02 	call	0x400	;  0x400
  ee:	0c 94 0d 02 	jmp	0x41a	;  0x41a
  f2:	0c 94 00 00 	jmp	0	;  0x0
  f6:	61 e0       	ldi	r22, 0x01	; 1
  f8:	80 91 00 01 	lds	r24, 0x0100
  fc:	0c 94 91 01 	jmp	0x322	;  0x322
 100:	cf 93       	push	r28
 102:	df 93       	push	r29
 104:	c0 e0       	ldi	r28, 0x00	; 0
 106:	d1 e0       	ldi	r29, 0x01	; 1
 108:	61 e0       	ldi	r22, 0x01	; 1
 10a:	88 81       	ld	r24, Y
 10c:	0e 94 ca 01 	call	0x394	;  0x394
 110:	68 ee       	ldi	r22, 0xE8	; 232
 112:	73 e0       	ldi	r23, 0x03	; 3
 114:	80 e0       	ldi	r24, 0x00	; 0
 116:	90 e0       	ldi	r25, 0x00	; 0
 118:	0e 94 07 01 	call	0x20e	;  0x20e
 11c:	60 e0       	ldi	r22, 0x00	; 0
 11e:	88 81       	ld	r24, Y
 120:	0e 94 ca 01 	call	0x394	;  0x394
 124:	68 ee       	ldi	r22, 0xE8	; 232
 126:	73 e0       	ldi	r23, 0x03	; 3
 128:	80 e0       	ldi	r24, 0x00	; 0
 12a:	90 e0       	ldi	r25, 0x00	; 0
 12c:	df 91       	pop	r29
 12e:	cf 91       	pop	r28
 130:	0c 94 07 01 	jmp	0x20e	;  0x20e
 134:	1f 92       	push	r1
 136:	0f 92       	push	r0
 138:	0f b6       	in	r0, 0x3f	; 63
 13a:	0f 92       	push	r0
 13c:	11 24       	eor	r1, r1
 13e:	2f 93       	push	r18
 140:	3f 93       	push	r19
 142:	8f 93       	push	r24
 144:	9f 93       	push	r25
 146:	af 93       	push	r26
 148:	bf 93       	push	r27
 14a:	80 91 03 01 	lds	r24, 0x0103
 14e:	90 91 04 01 	lds	r25, 0x0104
 152:	a0 91 05 01 	lds	r26, 0x0105
 156:	b0 91 06 01 	lds	r27, 0x0106
 15a:	30 91 02 01 	lds	r19, 0x0102
 15e:	23 e0       	ldi	r18, 0x03	; 3
 160:	23 0f       	add	r18, r19
 162:	2d 37       	cpi	r18, 0x7D	; 125
 164:	20 f4       	brcc	.+8      	;  0x16e
 166:	01 96       	adiw	r24, 0x01	; 1
 168:	a1 1d       	adc	r26, r1
 16a:	b1 1d       	adc	r27, r1
 16c:	05 c0       	rjmp	.+10     	;  0x178
 16e:	26 e8       	ldi	r18, 0x86	; 134
 170:	23 0f       	add r18, r19
 172:	02 96       	adiw	r24, 0x02	; 2
 174:	a1 1d       	adc	r26, r1
 176:	b1 1d       	adc	r27, r1
 178:	20 93 02 01 	sts	0x0102, r18
 17c:	80 93 03 01 	sts	0x0103, r24
 180:	90 93 04 01 	sts	0x0104, r25
 184:	a0 93 05 01 	sts	0x0105, r26
 188:	b0 93 06 01 	sts	0x0106, r27
 18c:	80 91 07 01 	lds	r24, 0x0107
 190:	90 91 08 01 	lds	r25, 0x0108
 194:	a0 91 09 01 	lds	r26, 0x0109
 198:	b0 91 0a 01 	lds	r27, 0x010A
 19c:	01 96       	adiw	r24, 0x01	; 1
 19e:	a1 1d       	adc	r26, r1
 1a0:	b1 1d       	adc	r27, r1
 1a2:	80 93 07 01 	sts	0x0107, r24
 1a6:	90 93 08 01 	sts	0x0108, r25
 1aa:	a0 93 09 01 	sts	0x0109, r26
 1ae:	b0 93 0a 01 	sts	0x010A, r27
 1b2:	bf 91       	pop	r27
 1b4:	af 91       	pop	r26
 1b6:	9f 91       	pop	r25
 1b8:	8f 91       	pop	r24
 1ba:	3f 91       	pop	r19
 1bc:	2f 91       	pop	r18
 1be:	0f 90       	pop	r0
 1c0:	0f be       	out	0x3f, r0	; 63
 1c2:	0f 90       	pop	r0
 1c4:	1f 90       	pop	r1
 1c6:	18 95       	reti
 1c8:	3f b7       	in	r19, 0x3f	; 63
 1ca:	f8 94       	cli
 1cc:	80 91 07 01 	lds	r24, 0x0107
 1d0:	90 91 08 01 	lds	r25, 0x0108
 1d4:	a0 91 09 01 	lds	r26, 0x0109
 1d8:	b0 91 0a 01 	lds	r27, 0x010A
 1dc:	26 b5       	in	r18, 0x26	; 38
 1de:	a8 9b       	sbis	0x15, 0	; 21
 1e0:	05 c0       	rjmp	.+10     	;  0x1ec
 1e2:	2f 3f       	cpi	r18, 0xFF	; 255
 1e4:	19 f0       	breq	.+6      	;  0x1ec
 1e6:	01 96       	adiw	r24, 0x01	; 1
 1e8:	a1 1d       	adc	r26, r1
 1ea:	b1 1d       	adc	r27, r1
 1ec:	3f bf       	out	0x3f, r19	; 63
 1ee:	66 27       	eor	r22, r22
 1f0:	78 2f       	mov	r23, r24
 1f2:	89 2f       	mov	r24, r25
 1f4:	9a 2f       	mov	r25, r26
 1f6:	62 0f       	add	r22, r18
 1f8:	71 1d       	adc	r23, r1
 1fa:	81 1d       	adc	r24, r1
 1fc:	91 1d       	adc	r25, r1
 1fe:	42 e0       	ldi	r20, 0x02	; 2
 200:	66 0f       	add	r22, r22
 202:	77 1f       	adc	r23, r23
 204:	88 1f       	adc	r24, r24
 206:	99 1f       	adc	r25, r25
 208:	4a 95       	dec	r20
 20a:	d1 f7       	brne	.-12     	;  0x200
 20c:	08 95       	ret
 20e:	cf 92       	push	r12
 210:	df 92       	push	r13
 212:	ef 92       	push	r14
 214:	ff 92       	push	r15
 216:	cf 93       	push	r28
 218:	df 93       	push	r29
 21a:	6b 01       	movw	r12, r22
 21c:	7c 01       	movw	r14, r24
 21e:	0e 94 e4 00 	call	0x1c8	;  0x1c8
 222:	eb 01       	movw	r28, r22
 224:	c1 14       	cp	r12, r1
 226:	d1 04       	cpc	r13, r1
 228:	e1 04       	cpc	r14, r1
 22a:	f1 04       	cpc	r15, r1
 22c:	79 f0       	breq	.+30     	;  0x24c
 22e:	0e 94 e4 00 	call	0x1c8	;  0x1c8
 232:	6c 1b       	sub	r22, r28
 234:	7d 0b       	sbc	r23, r29
 236:	68 3e       	cpi	r22, 0xE8	; 232
 238:	73 40       	sbci	r23, 0x03	; 3
 23a:	a0 f3       	brcs	.-24     	;  0x224
 23c:	81 e0       	ldi	r24, 0x01	; 1
 23e:	c8 1a       	sub	r12, r24
 240:	d1 08       	sbc	r13, r1
 242:	e1 08       	sbc	r14, r1
 244:	f1 08       	sbc	r15, r1
 246:	c8 51       	subi	r28, 0x18	; 24
 248:	dc 4f       	sbci	r29, 0xFC	; 252
 24a:	ec cf       	rjmp	.-40     	;  0x224
 24c:	df 91       	pop	r29
 24e:	cf 91       	pop	r28
 250:	ff 90       	pop	r15
 252:	ef 90       	pop	r14
 254:	df 90       	pop	r13
 256:	cf 90       	pop	r12
 258:	08 95       	ret
 25a:	78 94       	sei
 25c:	84 b5       	in	r24, 0x24	; 36
 25e:	82 60       	ori	r24, 0x02	; 2
 260:	84 bd       	out	0x24, r24	; 36
 262:	84 b5       	in	r24, 0x24	; 36
 264:	81 60       	ori	r24, 0x01	; 1
 266:	84 bd       	out	0x24, r24	; 36
 268:	85 b5       	in	r24, 0x25	; 37
 26a:	82 60       	ori	r24, 0x02	; 2
 26c:	85 bd       	out	0x25, r24	; 37
 26e:	85 b5       	in	r24, 0x25	; 37
 270:	81 60       	ori	r24, 0x01	; 1
 272:	85 bd       	out	0x25, r24	; 37
 274:	ee e6       	ldi	r30, 0x6E	; 110
 276:	f0 e0       	ldi	r31, 0x00	; 0
 278:	80 81       	ld	r24, Z
 27a:	81 60       	ori	r24, 0x01	; 1
 27c:	80 83       	st	Z, r24
 27e:	e1 e8       	ldi	r30, 0x81	; 129
 280:	f0 e0       	ldi	r31, 0x00	; 0
 282:	10 82       	st	Z, r1
 284:	80 81       	ld	r24, Z
 286:	82 60       	ori	r24, 0x02	; 2
 288:	80 83       	st	Z, r24
 28a:	80 81       	ld	r24, Z
 28c:	81 60       	ori	r24, 0x01	; 1
 28e:	80 83       	st	Z, r24
 290:	e0 e8       	ldi	r30, 0x80	; 128
 292:	f0 e0       	ldi	r31, 0x00	; 0
 294:	80 81       	ld	r24, Z
 296:	81 60       	ori	r24, 0x01	; 1
 298:	80 83       	st	Z, r24
 29a:	e1 eb       	ldi	r30, 0xB1	; 177
 29c:	f0 e0       	ldi	r31, 0x00	; 0
 29e:	80 81       	ld	r24, Z
 2a0:	84 60       	ori	r24, 0x04	; 4
 2a2:	80 83       	st	Z, r24
 2a4:	e0 eb       	ldi	r30, 0xB0	; 176
 2a6:	f0 e0       	ldi	r31, 0x00	; 0
 2a8:	80 81       	ld	r24, Z
 2aa:	81 60       	ori	r24, 0x01	; 1
 2ac:	80 83       	st	Z, r24
 2ae:	ea e7       	ldi	r30, 0x7A	; 122
 2b0:	f0 e0       	ldi	r31, 0x00	; 0
 2b2:	80 81       	ld	r24, Z
 2b4:	84 60       	ori	r24, 0x04	; 4
 2b6:	80 83       	st	Z, r24
 2b8:	80 81       	ld	r24, Z
 2ba:	82 60       	ori	r24, 0x02	; 2
 2bc:	80 83       	st	Z, r24
 2be:	80 81       	ld	r24, Z
 2c0:	81 60       	ori	r24, 0x01	; 1
 2c2:	80 83       	st	Z, r24
 2c4:	80 81       	ld	r24, Z
 2c6:	80 68       	ori	r24, 0x80	; 128
 2c8:	80 83       	st	Z, r24
 2ca:	10 92 c1 00 	sts	0x00C1, r1
 2ce:	08 95       	ret
 2d0:	83 30       	cpi	r24, 0x03	; 3
 2d2:	81 f0       	breq	.+32     	;  0x2f4
 2d4:	28 f4       	brcc	.+10     	;  0x2e0
 2d6:	81 30       	cpi	r24, 0x01	; 1
 2d8:	99 f0       	breq	.+38     	;  0x300
 2da:	82 30       	cpi	r24, 0x02	; 2
 2dc:	a1 f0       	breq	.+40     	;  0x306
 2de:	08 95       	ret
 2e0:	86 30       	cpi	r24, 0x06	; 6
 2e2:	a9 f0       	breq	.+42     	;  0x30e
 2e4:	87 30       	cpi	r24, 0x07	; 7
 2e6:	b9 f0       	breq	.+46     	;  0x316
 2e8:	84 30       	cpi	r24, 0x04	; 4
 2ea:	d1 f4       	brne	.+52     	;  0x320
 2ec:	80 91 80 00 	lds	r24, 0x0080
 2f0:	8f 7d       	andi	r24, 0xDF	; 223
 2f2:	03 c0       	rjmp	.+6      	;  0x2fa
 2f4:	80 91 80 00 	lds	r24, 0x0080
 2f8:	8f 77       	andi	r24, 0x7F	; 127
 2fa:	80 93 80 00 	sts	0x0080, r24
 2fe:	08 95       	ret
 300:	84 b5       	in	r24, 0x24	; 36
 302:	8f 77       	andi	r24, 0x7F	; 127
 304:	02 c0       	rjmp	.+4      	;  0x30a
 306:	84 b5       	in	r24, 0x24	; 36
 308:	8f 7d       	andi	r24, 0xDF	; 223
 30a:	84 bd       	out	0x24, r24	; 36
 30c:	08 95       	ret
 30e:	80 91 b0 00 	lds	r24, 0x00B0
 312:	8f 77       	andi	r24, 0x7F	; 127
 314:	03 c0       	rjmp	.+6      	;  0x31c
 316:	80 91 b0 00 	lds	r24, 0x00B0
 31a:	8f 7d       	andi	r24, 0xDF	; 223
 31c:	80 93 b0 00 	sts	0x00B0, r24
 320:	08 95       	ret
 322:	cf 93       	push	r28
 324:	df 93       	push	r29
 326:	90 e0       	ldi	r25, 0x00	; 0
 328:	fc 01       	movw	r30, r24
 32a:	e4 58       	subi	r30, 0x84	; 132
 32c:	ff 4f       	sbci	r31, 0xFF	; 255
 32e:	24 91       	lpm	r18, Z
 330:	fc 01       	movw	r30, r24
 332:	e0 57       	subi	r30, 0x70	; 112
 334:	ff 4f       	sbci	r31, 0xFF	; 255
 336:	84 91       	lpm	r24, Z
 338:	88 23       	and	r24, r24
 33a:	49 f1       	breq	.+82     	;  0x38e
 33c:	90 e0       	ldi	r25, 0x00	; 0
 33e:	88 0f       	add	r24, r24
 340:	99 1f       	adc	r25, r25
 342:	fc 01       	movw	r30, r24
 344:	e2 55       	subi	r30, 0x52	; 82
 346:	ff 4f       	sbci	r31, 0xFF	; 255
 348:	a5 91       	lpm	r26, Z+
 34a:	b4 91       	lpm	r27, Z
 34c:	8c 55       	subi	r24, 0x5C	; 92
 34e:	9f 4f       	sbci	r25, 0xFF	; 255
 350:	fc 01       	movw	r30, r24
 352:	c5 91       	lpm	r28, Z+
 354:	d4 91       	lpm	r29, Z
 356:	9f b7       	in	r25, 0x3f	; 63
 358:	61 11       	cpse	r22, r1
 35a:	08 c0       	rjmp	.+16     	;  0x36c
 35c:	f8 94       	cli
 35e:	8c 91       	ld	r24, X
 360:	20 95       	com	r18
 362:	82 23       	and	r24, r18
 364:	8c 93       	st	X, r24
 366:	88 81       	ld	r24, Y
 368:	82 23       	and	r24, r18
 36a:	0a c0       	rjmp	.+20     	;  0x380
 36c:	62 30       	cpi	r22, 0x02	; 2
 36e:	51 f4       	brne	.+20     	;  0x384
 370:	f8 94       	cli
 372:	8c 91       	ld	r24, X
 374:	32 2f       	mov	r19, r18
 376:	30 95       	com	r19
 378:	83 23       	and	r24, r19
 37a:	8c 93       	st	X, r24
 37c:	88 81       	ld	r24, Y
 37e:	82 2b       	or	r24, r18
 380:	88 83       	st	Y, r24
 382:	04 c0       	rjmp	.+8      	;  0x38c
 384:	f8 94       	cli
 386:	8c 91       	ld	r24, X
 388:	82 2b       	or	r24, r18
 38a:	8c 93       	st	X, r24
 38c:	9f bf       	out	0x3f, r25	; 63
 38e:	df 91       	pop	r29
 390:	cf 91       	pop	r28
 392:	08 95       	ret
 394:	0f 93       	push	r16
 396:	1f 93       	push	r17
 398:	cf 93       	push	r28
 39a:	df 93       	push	r29
 39c:	1f 92       	push	r1
 39e:	cd b7       	in	r28, 0x3d	; 61
 3a0:	de b7       	in	r29, 0x3e	; 62
 3a2:	28 2f       	mov	r18, r24
 3a4:	30 e0       	ldi	r19, 0x00	; 0
 3a6:	f9 01       	movw	r30, r18
 3a8:	e8 59       	subi	r30, 0x98	; 152
 3aa:	ff 4f       	sbci	r31, 0xFF	; 255
 3ac:	84 91       	lpm	r24, Z
 3ae:	f9 01       	movw	r30, r18
 3b0:	e4 58       	subi	r30, 0x84	; 132
 3b2:	ff 4f       	sbci	r31, 0xFF	; 255
 3b4:	14 91       	lpm	r17, Z
 3b6:	f9 01       	movw	r30, r18
 3b8:	e0 57       	subi	r30, 0x70	; 112
 3ba:	ff 4f       	sbci	r31, 0xFF	; 255
 3bc:	04 91       	lpm	r16, Z
 3be:	00 23       	and	r16, r16
 3c0:	c9 f0       	breq	.+50     	;  0x3f4
 3c2:	88 23       	and	r24, r24
 3c4:	21 f0       	breq	.+8      	;  0x3ce
 3c6:	69 83       	std	Y+1, r22	; 0x01
 3c8:	0e 94 68 01 	call	0x2d0	;  0x2d0
 3cc:	69 81       	ldd	r22, Y+1	; 0x01
 3ce:	e0 2f       	mov	r30, r16
 3d0:	f0 e0       	ldi	r31, 0x00	; 0
 3d2:	ee 0f       	add	r30, r30
 3d4:	ff 1f       	adc	r31, r31
 3d6:	ec 55       	subi	r30, 0x5C	; 92
 3d8:	ff 4f       	sbci	r31, 0xFF	; 255
 3da:	a5 91       	lpm	r26, Z+
 3dc:	b4 91       	lpm	r27, Z
 3de:	9f b7       	in	r25, 0x3f	; 63
 3e0:	f8 94       	cli
 3e2:	8c 91       	ld	r24, X
 3e4:	61 11       	cpse	r22, r1
 3e6:	03 c0       	rjmp	.+6      	;  0x3ee
 3e8:	10 95       	com	r17
 3ea:	81 23       	and	r24, r17
 3ec:	01 c0       	rjmp	.+2      	;  0x3f0
 3ee:	81 2b       	or	r24, r17
 3f0:	8c 93       	st	X, r24
 3f2:	9f bf       	out	0x3f, r25	; 63
 3f4:	0f 90       	pop	r0
 3f6:	df 91       	pop	r29
 3f8:	cf 91       	pop	r28
 3fa:	1f 91       	pop	r17
 3fc:	0f 91       	pop	r16
 3fe:	08 95       	ret
 400:	0e 94 2d 01 	call	0x25a	;  0x25a
 404:	0e 94 7b 00 	call	0xf6	;  0xf6
 408:	c0 e0       	ldi	r28, 0x00	; 0
 40a:	d0 e0       	ldi	r29, 0x00	; 0
 40c:	0e 94 80 00 	call	0x100	;  0x100
 410:	20 97       	sbiw	r28, 0x00	; 0
 412:	e1 f3       	breq	.-8      	;  0x40c
 414:	0e 94 00 00 	call	0	;  0x0
 418:	f9 cf       	rjmp	.-14     	;  0x40c
 41a:	f8 94       	cli
 41c:	ff cf       	rjmp	.-2      	;  0x41c
 41e:	0d 00       	.word	0x000d	; ????
